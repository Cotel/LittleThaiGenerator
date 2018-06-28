package com.cotel.littlethaigenerator

import arrow.data.State
import arrow.data.fix
import arrow.data.map
import arrow.instance
import arrow.instances.ForState
import arrow.typeclasses.Show
import arrow.typeclasses.binding

sealed class Base(val index: Int) {
    object RiceNoodles : Base(0)
    object EggNoodles : Base(1)
    object UdonNoodles : Base(2)
    object ThaiNoodles : Base(3)
    object Rice : Base(4)
    object IntegralRice : Base(5)
    object VegetablesMix : Base(6)

    companion object {
        fun parse(index: Int): Base = when (index) {
            RiceNoodles.index -> RiceNoodles
            EggNoodles.index -> EggNoodles
            UdonNoodles.index -> UdonNoodles
            ThaiNoodles.index -> ThaiNoodles
            Rice.index -> Rice
            IntegralRice.index -> IntegralRice
            else -> VegetablesMix
        }
    }
}

sealed class Ingredient(val index: Int) {
    object Chicken : Ingredient(0)
    object Beef : Ingredient(1)
    object Pork : Ingredient(2)
    object Shiitake : Ingredient(3)
    object Calamari : Ingredient(4)
    object Mushrooms : Ingredient(5)
    object PepperMix : Ingredient(6)
    object Broccoli : Ingredient(7)
    object Nuts : Ingredient(8)
    object PakChoi : Ingredient(9)
    object Tofu : Ingredient(10)
    object FishyTofu : Ingredient(11)
    object Pineapple : Ingredient(12)
    object Prawns : Ingredient(13)
    object LittleThaiMix : Ingredient(14)

    companion object {
        fun parse(index: Int): Ingredient = when (index) {
            Chicken.index -> Chicken
            Beef.index -> Beef
            Pork.index -> Pork
            Shiitake.index -> Shiitake
            Calamari.index -> Calamari
            Mushrooms.index -> Mushrooms
            PepperMix.index -> PepperMix
            Broccoli.index -> Broccoli
            Nuts.index -> Nuts
            PakChoi.index -> PakChoi
            Tofu.index -> Tofu
            FishyTofu.index -> FishyTofu
            Pineapple.index -> Pineapple
            Prawns.index -> Prawns
            else -> LittleThaiMix
        }
    }
}

sealed class Sauce(val index: Int) {
    object Curry : Sauce(0)
    object Palythai : Sauce(1)
    object Thai : Sauce(2)
    object Bittersweet : Sauce(3)
    object Oysters : Sauce(4)
    object Teriyaki : Sauce(5)
    object Seafood : Sauce(6)
    object Spicy : Sauce(7)
    object Nuts : Sauce(8)
    object SweetPepper : Sauce(9)
    object Garlick : Sauce(10)
    object Sate : Sauce(11)
    object Chinese : Sauce(12)
    object Chen : Sauce(13)
    object TomYum : Sauce(14)

    companion object {
        fun parse(index: Int): Sauce = when (index) {
            Curry.index -> Curry
            Palythai.index -> Palythai
            Thai.index -> Thai
            Bittersweet.index -> Bittersweet
            Oysters.index -> Oysters
            Teriyaki.index -> Teriyaki
            Seafood.index -> Seafood
            Spicy.index -> Spicy
            Nuts.index -> Nuts
            SweetPepper.index -> SweetPepper
            Garlick.index -> Garlick
            Sate.index -> Sate
            Chinese.index -> Chinese
            Chen.index -> Chen
            else -> TomYum
        }
    }
}

@instance(Base::class)
interface BaseShowInstance : Show<Base> {
    override fun Base.show(): String = when (this) {
        is Base.RiceNoodles -> "Rice Noodles"
        is Base.EggNoodles -> "Egg Noodles"
        is Base.UdonNoodles -> "Udon Noodles"
        is Base.ThaiNoodles -> "Thai Noodles"
        is Base.Rice -> "White rice"
        is Base.IntegralRice -> "Integral rice"
        is Base.VegetablesMix -> "Vegetables mix"
    }
}

@instance(Ingredient::class)
interface IngredientShowInstance : Show<Ingredient> {
    override fun Ingredient.show(): String = when (this) {
        is Ingredient.Chicken -> "Chicken"
        is Ingredient.Beef -> "Beef"
        is Ingredient.Pork -> "Pork"
        is Ingredient.Shiitake -> "Shiitake mushroom"
        is Ingredient.Calamari -> "Calamari"
        is Ingredient.PepperMix -> "Pepper mix"
        is Ingredient.Mushrooms -> "Mushrooms"
        is Ingredient.Broccoli -> "Broccoli"
        is Ingredient.Nuts -> "Nuts"
        is Ingredient.PakChoi -> "Pak Choi"
        is Ingredient.Tofu -> "Tofu"
        is Ingredient.FishyTofu -> "Fishy Tofu"
        is Ingredient.Pineapple -> "Pineapple"
        is Ingredient.Prawns -> "Prawns"
        is Ingredient.LittleThaiMix -> "Little Thai Mix"
    }
}

@instance(Sauce::class)
interface SauceShowInstance : Show<Sauce> {
    override fun Sauce.show(): String = when (this) {
        is Sauce.Curry -> "Curry"
        is Sauce.Palythai -> "Palythai"
        is Sauce.Thai -> "Thai"
        is Sauce.Bittersweet -> "Bittersweet"
        is Sauce.Oysters -> "Oysters"
        is Sauce.Teriyaki -> "Teriyaki"
        is Sauce.Seafood -> "Seafood"
        is Sauce.Spicy -> "Spicy"
        is Sauce.Nuts -> "Nuts"
        is Sauce.SweetPepper -> "Sweet Pepper"
        is Sauce.Garlick -> "Black garlick and sesame"
        is Sauce.Sate -> "Sate"
        is Sauce.Chinese -> "Chinese"
        is Sauce.Chen -> "Chen"
        is Sauce.TomYum -> "Tom Yum"
    }
}

fun randomBase(): State<RNG, Base> = randomPositiveUpTo(7)
    .map { Base.parse(it) }

fun randomIngredient(): State<RNG, Ingredient> = randomPositiveUpTo(15)
    .map { Ingredient.parse(it) }

fun randomIngredientExcept(ingredient: Ingredient): State<RNG, Ingredient> = ForState<RNG>() extensions {
    binding {
        val newIngredient = randomIngredient().bind()
        if (newIngredient == ingredient) {
            randomIngredientExcept(ingredient).bind()
        } else {
            newIngredient
        }
    }.fix()
}

fun randomSauce(): State<RNG, Sauce> = randomPositiveUpTo(15)
    .map { Sauce.parse(it) }