module Main where

import Lib
import Control.Monad.Random


main :: IO ()
main = do
    putStrLn "## Little Thai Generator ##"
    g <- getStdGen
    base <- evalRandIO base
    ingredient <- evalRandIO ingredient
    sauce <- evalRandIO sauce
    putStrLn ("Base: " ++ show base)
    putStrLn ("Ingredient: " ++ show ingredient)
    putStrLn ("Sauce: " ++ show sauce)
