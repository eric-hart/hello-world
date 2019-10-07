ThisBuild / scalaVersion := "2.12.8"
ThisBuild / organization := "com.example"

lazy val myScala = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "my-scala",
    resolvers += Resolver.sonatypeRepo("snapshots"),
    libraryDependencies += guice,
    libraryDependencies += "com.typesafe.play" %% "play" % "2.6.21",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test,
  )
