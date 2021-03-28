scalaVersion := "3.0.0-RC1"

//"com.softwaremill.diffx" %% "diffx-scalatest" % "0.4.3" % Test ::
//"com.novocode" % "junit-interface" % "0.11" % Test
//"org.scalamock" %% "scalamock" % "5.1.0" % Test ::

libraryDependencies ++=
  "com.github.alexarchambault" %% "scalacheck-shapeless_1.14" % "1.2.5" % Test ::
    "org.scalacheck" %% "scalacheck" % "1.15.3" % Test ::
    "org.scalatest" %% "scalatest" % "3.2.5" % Test ::
    Nil
