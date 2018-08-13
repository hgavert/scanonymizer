val DEPS = Seq(
//  "com.maxmind.geoip2"  % "geoip2"          % "2.3.1",
//  "com.twitter"        %% "util-collection" % "6.23.0"
)

val TEST = Seq(
  "org.scalacheck" %% "scalacheck" % "1.12.2",
  "org.scalatest"  %% "scalatest"  % "2.2.4"
).map(_ % Test)

lazy val root = (project in file("."))
  .settings(
    name := "scanonymizer",
    version := "0.1",
    scalaVersion := "2.11.12",
    scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8"),
    libraryDependencies ++= (DEPS ++ TEST)
  )
