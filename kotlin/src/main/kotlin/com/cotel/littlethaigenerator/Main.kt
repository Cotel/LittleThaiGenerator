package com.cotel.littlethaigenerator

import arrow.data.fix
import arrow.data.run
import arrow.instances.ForState
import arrow.typeclasses.binding

fun main(vararg args: String) {
    val ingredientShowInstance = Ingredient.show()

    val x = ForState<RNG>() extensions {
        binding {
            println("## Little Thai Generator ##")
            val base: Base = Base.generate().run { generate() }
            val ingredient: Ingredient = randomIngredient().bind()
            val ingredient2: Ingredient = randomIngredientExcept(ingredient).bind()
            val sauce: Sauce = randomSauce().bind()

            println("Base: ${Base.show().run { base.show() }}")
            println("Ingredient: ${ingredientShowInstance.run { ingredient.show() }}")
            println("Ingredient 2: ${ingredientShowInstance.run { ingredient2.show() }}")
            println("Sauce: ${Sauce.show().run { sauce.show() }}")
        }.fix()
    }

    x.run(RNG.simple(System.currentTimeMillis()))

}