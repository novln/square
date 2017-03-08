enablePlugins(JavaAppPackaging, UniversalPlugin)

name := "square"
version := "1.0.0"
organization := "xyz.novln"

scalaVersion := "2.12.1"

scalacOptions ++= Seq(
  "-feature",
  "-unchecked",
  "-deprecation",
  "-encoding", "UTF-8",
  "-Ywarn-value-discard",
  "-Ywarn-dead-code",
  "-Ywarn-unused-import",
  "-Ywarn-numeric-widen",
  "-Xlint",
  "-Xfatal-warnings",
  "-target:jvm-1.8"
)

javaOptions += "-Duser.timezone=UTC"

// Database dependencies
// libraryDependencies ++= Seq(
//   "com.typesafe.play" %% "anorm" % "2.5.2",
//   "org.postgresql" % "postgresql" % "9.4.1212",
//   "org.flywaydb" %% "flyway-play" % "3.0.1"
// )

// HTTP dependencies
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.0.4",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.4"
)

// Hystrix dependencies
// libraryDependencies ++= Seq(
//   "com.netflix.hystrix" % "hystrix-core" % "1.5.8"
// )
//
// // Testing dependencies
// libraryDependencies ++= Seq(
//   "org.scalatest" %% "scalatest" % "2.2.6" % "test",
//   "org.scalatestplus" %% "play" % "1.4.0" % "test",
//   "org.mockito" % "mockito-core" % "1.10.19" % "test"
// )


///////////////////////////////////////////////////////////////////////////////////////////
//                                                                                       //
//                               WartRemover configuration                               //
//                                                                                       //
///////////////////////////////////////////////////////////////////////////////////////////

wartremoverErrors ++= Warts.allBut(
  Wart.NonUnitStatements, Wart.Product, Wart.Serializable, Wart.Equals,
  Wart.DefaultArguments, Wart.FinalCaseClass, Wart.Overloading, Wart.LeakingSealed
)

wartremoverExcluded ++= Seq(
  baseDirectory.value / "app" / "components" / "db" / "Anorm.scala",
  crossTarget.value / "routes" / "main" / "controllers" / "ReverseRoutes.scala",
  crossTarget.value / "routes" / "main" / "controllers" / "routes.scala",
  crossTarget.value / "routes" / "main" / "router" / "Routes.scala",
  crossTarget.value / "routes" / "main" / "router" / "RoutesPrefix.scala"
)

///////////////////////////////////////////////////////////////////////////////////////////
//                                                                                       //
//                                  Play configuration                                   //
//                                                                                       //
///////////////////////////////////////////////////////////////////////////////////////////

javaOptions in Test += "-Dconfig.file=conf/application.test.conf"

javaOptions in Test += "-Dlogger.file=conf/logback.test.xml"
