package com.cotel.littlethaigenerator

import arrow.data.fix
import arrow.data.run
import arrow.instances.ForState
import arrow.typeclasses.binding
import io.kotlintest.matchers.numerics.shouldBeBetween
import io.kotlintest.specs.StringSpec

class RandomTest : StringSpec({

  "randomPositiveUpTo should return always positive number between 0 and n" {
    val x = ForState<RNG>() extensions {
      binding {
        val number1 = randomPositiveUpTo(10).bind()
        number1.shouldBeBetween(0, 10)
        val number2 = randomPositiveUpTo(10).bind()
        number2.shouldBeBetween(0, 10)
        val number3 = randomPositiveUpTo(10).bind()
        number3.shouldBeBetween(0, 10)
        val number4 = randomPositiveUpTo(10).bind()
        number4.shouldBeBetween(0, 10)
        val number5 = randomPositiveUpTo(10).bind()
        number5.shouldBeBetween(0, 10)
        val number6 = randomPositiveUpTo(10).bind()
        number6.shouldBeBetween(0, 10)
        val number7 = randomPositiveUpTo(10).bind()
        number7.shouldBeBetween(0, 10)
        val number8 = randomPositiveUpTo(10).bind()
        number8.shouldBeBetween(0, 10)
        val number9 = randomPositiveUpTo(10).bind()
        number9.shouldBeBetween(0, 10)
        val number10 = randomPositiveUpTo(10).bind()
        number10.shouldBeBetween(0, 10)
        val number11 = randomPositiveUpTo(10).bind()
        number11.shouldBeBetween(0, 10)
        number11
      }.fix()
    }

    x.run(RNG.simple(System.currentTimeMillis()))
  }
})