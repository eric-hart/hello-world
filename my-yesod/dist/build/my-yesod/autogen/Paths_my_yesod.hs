{-# LANGUAGE CPP #-}
{-# LANGUAGE NoRebindableSyntax #-}
{-# OPTIONS_GHC -fno-warn-missing-import-lists #-}
module Paths_my_yesod (
    version,
    getBinDir, getLibDir, getDynLibDir, getDataDir, getLibexecDir,
    getDataFileName, getSysconfDir
  ) where

import qualified Control.Exception as Exception
import Data.Version (Version(..))
import System.Environment (getEnv)
import Prelude

#if defined(VERSION_base)

#if MIN_VERSION_base(4,0,0)
catchIO :: IO a -> (Exception.IOException -> IO a) -> IO a
#else
catchIO :: IO a -> (Exception.Exception -> IO a) -> IO a
#endif

#else
catchIO :: IO a -> (Exception.IOException -> IO a) -> IO a
#endif
catchIO = Exception.catch

version :: Version
version = Version [0,1,0,0] []
bindir, libdir, dynlibdir, datadir, libexecdir, sysconfdir :: FilePath

bindir     = "/Users/crux/.cabal/bin"
libdir     = "/Users/crux/.cabal/lib/x86_64-osx-ghc-8.4.4/my-yesod-0.1.0.0-Jdm59dSlv8s8FZ2qH2cIRp-my-yesod"
dynlibdir  = "/Users/crux/.cabal/lib/x86_64-osx-ghc-8.4.4"
datadir    = "/Users/crux/.cabal/share/x86_64-osx-ghc-8.4.4/my-yesod-0.1.0.0"
libexecdir = "/Users/crux/.cabal/libexec/x86_64-osx-ghc-8.4.4/my-yesod-0.1.0.0"
sysconfdir = "/Users/crux/.cabal/etc"

getBinDir, getLibDir, getDynLibDir, getDataDir, getLibexecDir, getSysconfDir :: IO FilePath
getBinDir = catchIO (getEnv "my_yesod_bindir") (\_ -> return bindir)
getLibDir = catchIO (getEnv "my_yesod_libdir") (\_ -> return libdir)
getDynLibDir = catchIO (getEnv "my_yesod_dynlibdir") (\_ -> return dynlibdir)
getDataDir = catchIO (getEnv "my_yesod_datadir") (\_ -> return datadir)
getLibexecDir = catchIO (getEnv "my_yesod_libexecdir") (\_ -> return libexecdir)
getSysconfDir = catchIO (getEnv "my_yesod_sysconfdir") (\_ -> return sysconfdir)

getDataFileName :: FilePath -> IO FilePath
getDataFileName name = do
  dir <- getDataDir
  return (dir ++ "/" ++ name)
