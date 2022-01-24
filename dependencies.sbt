ThisBuild / scalaVersion := "3.0.1"
//ThisBuild / crossScalaVersions += "2.13.5"

//resolvers += sbt.Opts.resolver.sonatypeReleases

libraryDependencies ++=
  //("com.spotify" % "magnolify-scalacheck" % "0.4.3" % Test).cross(CrossVersion.for3Use2_13) ::
  //("com.softwaremill.diffx" %% "diffx-scalatest" % "0.4.5" % Test).cross(CrossVersion.for3Use2_13) ::
  ("org.scalacheck" %% "scalacheck" % "1.15.4" % Test) ::
    //("org.scalamock" %% "scalamock" % "5.1.0" % Test).cross(CrossVersion.for3Use2_13) ::
    ("org.scalatest" %% "scalatest" % "3.2.9" % Test) ::
    ("org.scalatestplus" %% "scalacheck-1-15" % "3.2.11.0" % Test) ::
    Nil
