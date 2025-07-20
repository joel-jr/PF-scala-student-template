val scala3Version = "3.7.0"

lazy val w01_02 = project.in(file("w1,2-intro-func-prog+scala"))
lazy val w03    = project.in(file("w3-functions-basic"))
lazy val w04_05 = project.in(file("w4,5-functions-recursion"))

lazy val root = project
  .in(file("."))
  .aggregate(w01_02, w03, w04_05)
  .settings(
    name := "student-template",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )