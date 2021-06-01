/** @see [[https://dotty.epfl.ch/docs/reference/other-new-features/safe-initialization.html]] */
ThisBuild / scalacOptions ++= {
  CrossVersion.partialVersion(scalaVersion.value) match {

    case Some((3, _)) =>
      "-Ysafe-init" ::
        Nil

    case _ =>
      Nil

  }
}
