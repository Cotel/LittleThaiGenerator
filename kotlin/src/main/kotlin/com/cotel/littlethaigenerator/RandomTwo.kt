package com.cotel.littlethaigenerator

import java.util.*

interface RandomGenerator<A> {
  fun generate(): A

  companion object {
    inline operator fun <A> invoke(crossinline generate: () -> A): RandomGenerator<A> = object : RandomGenerator<A> {
      override fun generate(): A = generate()
    }
  }
}

interface IntRandomGeneratorInstance : RandomGenerator<Int> {
  override fun generate(): Int = Random().nextInt()
}

fun Int.Companion.generate(): RandomGenerator<Int> = object : IntRandomGeneratorInstance {}

private fun randomIntUpTo(n: Int): Int {
  val randomInt = Int.generate().run { generate() }
  return Math.abs(randomInt) % (n + 1)
}

interface BaseRandomGeneratorInstance : RandomGenerator<Base> {
  override fun generate(): Base {
    val x = randomIntUpTo(6)
    return Base.parse(x)
  }
}

fun Base.Companion.generate(): RandomGenerator<Base> = object : BaseRandomGeneratorInstance {}
