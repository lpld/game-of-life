import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "game-of-life",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += scalaz,
    libraryDependencies += scalazEffect,
    scalacOptions += "-Ypartial-unification"
  )