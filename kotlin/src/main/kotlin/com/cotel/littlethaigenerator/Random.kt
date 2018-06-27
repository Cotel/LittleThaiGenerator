package com.cotel.littlethaigenerator

import arrow.core.Tuple2
import arrow.data.State
import arrow.data.map

typealias Rand<A> = (RNG) -> Tuple2<A, RNG>
typealias ArrowRand<A> = State<RNG, A>

interface RNG {
  fun next(): Tuple2<Int, RNG>

  companion object {
    fun simple(seed: Long): RNG = object : RNG {
      override fun next(): Tuple2<Int, RNG> {
        val seed2 = (seed * 0x5DEECE66DL + 0xBL) and ((1L shl 48) - 1)
        return Tuple2((seed2 ushr 16).toInt(), simple(seed2))
      }
    }
  }
}

fun <A> unit(a: A): Rand<A> = { rng -> Tuple2(a, rng) }

fun <A> arrowUnit(a: A): ArrowRand<A> = State { Tuple2(it, a) }

fun <A, B> Rand<A>.map(f: (A) -> B): Rand<B> = { rng ->
  val (a, rng2) = this(rng)
  Tuple2(f(a), rng2)
}

val int: Rand<Int> = { it.next() }

val arrowInt: ArrowRand<Int> = State { it.next().reverse() }

val randomPair: Rand<Tuple2<Int, Int>> = { rng ->
  val (i1, rng2) = rng.next()
  val (i2, rng3) = rng2.next()
  Tuple2(Tuple2(i1, i2), rng3)
}

val arrowRandomPair: ArrowRand<Tuple2<Int, Int>> = State { rng ->
  val (i1, rng2) = rng.next()
  val (i2, rng3) = rng2.next()
  Tuple2(rng3, Tuple2(i1, i2))
}

fun positiveMax(n: Int): Rand<Int> {
  val int: Rand<Int> = { it.next() }
  return int
      .map { Math.abs(it) }
      .map { it % (n + 1) }
}

fun arrowPositiveMax(n: Int): ArrowRand<Int> {
  val int: ArrowRand<Int> = State { it.next().reverse() }
  return int
      .map { Math.abs(it) }
      .map { it % (n + 1) }
}
