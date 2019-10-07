{-# LANGUAGE QuasiQuotes           #-}
{-# LANGUAGE TypeFamilies          #-}
{-# LANGUAGE TemplateHaskell       #-}
{-# LANGUAGE OverloadedStrings     #-}
{-# LANGUAGE MultiParamTypeClasses #-}
module Main where

import Yesod

data Minimal = Minimal

mkYesod "Minimal" [parseRoutes|
  /greeting GreetingR GET
|]

instance Yesod Minimal

getGreetingR :: Handler Html
getGreetingR = defaultLayout [whamlet|Hello World!|]

main :: IO ()
main = warp 3000 Minimal
