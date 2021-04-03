ThisBuild / scalaVersion := "3.0.0-RC2"

//"com.github.alexarchambault" %% "scalacheck-shapeless_1.14" % "1.2.5" % Test ::
//"com.novocode" % "junit-interface" % "0.11" % Test

libraryDependencies ++=
  ("com.softwaremill.diffx" %% "diffx-scalatest" % "0.4.3" % Test).cross(CrossVersion.for3Use2_13) ::
  "org.scalacheck" %% "scalacheck" % "1.15.3" % Test ::
    ("org.scalamock" %% "scalamock" % "5.1.0" % Test).cross(CrossVersion.for3Use2_13) ::
    ("org.scalatest" %% "scalatest" % "3.2.7" % Test).cross(CrossVersion.for3Use2_13) ::
    Nil
