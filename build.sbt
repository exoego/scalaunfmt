val scalafmtV = "2.0.0-RC8"
val metaconfigV = "0.9.3"
val scalatestV = "3.0.7"
val scoptV = "3.7.1"
val similarityV = "1.2.1"

lazy val scalaunfmt = (project in file(".")).
  settings(
    name := "scalaunfmt",
    organization := "com.github.tanishiking",
    scalaVersion := "2.12.7",

    libraryDependencies ++= Seq(
      "org.scalameta" %% "scalafmt-dynamic" % scalafmtV,
      "com.geirsson" %% "metaconfig-core" % metaconfigV,
      "com.geirsson" %% "metaconfig-typesafe-config" % metaconfigV,
      "com.github.scopt" %% "scopt" % scoptV,
      "org.scalatest" %% "scalatest" % scalatestV % "test",
      "info.debatty" % "java-string-similarity" % similarityV,
      // undeclared transitive dependency of coursier-small
      "org.scala-lang.modules" %% "scala-xml" % "1.2.0"
    ),

    // Compilation
    scalacOptions ++= Seq(
      "-unchecked",
      "-deprecation",
      "-feature",
      "-opt:l:inline",
      "-opt-inline-from"
    ),

    homepage := Some(url("https://github.com/tanishiking/scalaunfmt")),
    licenses := List("MIT License" -> url("http://www.opensource.org/licenses/mit-license.php")),
    developers := List(
      Developer(
        "tanishiking",
        "Rikito Taniguchi",
        "rikiriki1238@gmail.com",
        url("https://github.com/tanishiking")
      )
    )
  )
