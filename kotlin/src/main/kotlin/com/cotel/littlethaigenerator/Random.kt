package com.cotel.littlethaigenerator

import arrow.core.Tuple2
import arrow.data.State
import arrow.data.map

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

fun randomPositiveUpTo(n: Int): State<RNG, Int> {
    val int: State<RNG, Int> = State { it.next().reverse() }
    return int
        .map { Math.abs(it) }
        .map { it % (n + 1) }
}
