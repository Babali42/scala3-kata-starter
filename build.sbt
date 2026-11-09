ThisBuild / scalaVersion := "3.10.0"

lazy val template = (project in file("."))
  .settings(
    name := "kata",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.20" % Test
    )
  )
