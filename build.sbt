name := "akkademy-db"

version := "0.1"

scalaVersion := "2.13.2"
lazy val akkaVersion = "2.6.5"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test,
  "org.scalatest" %% "scalatest" % "3.1.0" % Test
)

// Enables me to Ctr-C to terminate a process gacefully
// https://www.scala-sbt.org/release/docs/Forking.html
fork := true
