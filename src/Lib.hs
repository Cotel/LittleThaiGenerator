module Lib
    ( Base
    , Ingredient
    , Sauce
    , base
    , ingredient
    , sauce
    ) where

import Control.Monad.Random

data Base = RiceNoodles 
          | EggNoodles 
          | UdonNoodles 
          | ThaiNoodles 
          | Rice 
          | IntegralRice 
          | VegetablesMix 
          deriving (Show, Enum, Bounded)

data Ingredient = Chicken
                 | Beef
                 | Pork
                 | Shiitake
                 | Calamari
                 | Mushrooms
                 | PepperMix
                 | Broccoli
                 | Nuts
                 | PakChoi
                 | Tofu
                 | FishyTofu
                 | Pineapple
                 | Prawns
                 | LittleThaiMix
                 deriving (Show, Enum, Bounded)

data Sauce = Curry
           | Palythai
           | Thai
           | Bittwersweet
           | Oysters
           | Teriyaki
           | Seafood
           | Spicy
           | NutsSauce
           | SweetPepper
           | Garlick
           | Sate
           | Chinese
           | Chen
           | TomYum
           deriving (Show, Enum, Bounded)
           
instance Random Base where
    random g = case randomR (fromEnum (minBound :: Base), fromEnum (maxBound :: Base)) g of
        (r, g') -> (toEnum r, g')

    randomR (a, b) g = case randomR (fromEnum a, fromEnum b) g of
        (r, g') -> (toEnum r, g')

instance Random Ingredient where
    random g = case randomR (fromEnum (minBound :: Ingredient), fromEnum (maxBound :: Ingredient)) g of
        (r, g') -> (toEnum r, g')

    randomR (a, b) g = case randomR (fromEnum a, fromEnum b) g of
        (r, g') -> (toEnum r, g')

instance Random Sauce where
    random g = case randomR (fromEnum (minBound :: Sauce), fromEnum (maxBound :: Sauce)) g of
        (r, g') -> (toEnum r, g')

    randomR (a, b) g = case randomR (fromEnum a, fromEnum b) g of
        (r, g') -> (toEnum r, g')

base :: RandomGen g => Rand g Base
base = getRandom

ingredient :: RandomGen g => Rand g Ingredient
ingredient = getRandom

sauce :: RandomGen g => Rand g Sauce
sauce = getRandom