name := """sbt-jmh-seed"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.8"

credentials += Credentials(Path.userHome / ".sbt" / "credentials")

libraryDependencies ++= Seq(
  // Add your own project dependencies in the form:
   "com.curalate" %% "dynamodb" % "1.0-SNAPSHOT" changing()
)

enablePlugins(JmhPlugin)
