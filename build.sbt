enablePlugins(JavaAppPackaging, UniversalPlugin)

name := "square"
version := "1.0.0"
organization := "xyz.novln"

scalaVersion := "2.12.1"

scalacOptions ++= Seq(
  "-feature",
  "-unchecked",
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-Ywarn-value-discard",
  "-Ywarn-dead-code",
  "-Ywarn-unused-import",
  "-Ywarn-numeric-widen",
  "-Xlint",
  "-Xfatal-warnings",
  "-target:jvm-1.8"
)

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

///////////////////////////////////////////////////////////////////////////////////////////
//                                                                                       //
//                               WartRemover configuration                               //
//                                                                                       //
///////////////////////////////////////////////////////////////////////////////////////////

wartremoverErrors ++= Warts.allBut(
  Wart.NonUnitStatements,
  Wart.Product,
  Wart.Serializable,
  Wart.Equals,
  Wart.DefaultArguments,
  Wart.FinalCaseClass,
  Wart.Overloading,
  Wart.LeakingSealed,
  Wart.PublicInference
)

wartremoverExcluded ++= Seq(
  baseDirectory.value / "app" / "components" / "db" / "Anorm.scala",
  crossTarget.value / "routes" / "main" / "controllers" / "ReverseRoutes.scala",
  crossTarget.value / "routes" / "main" / "controllers" / "routes.scala",
  crossTarget.value / "routes" / "main" / "router" / "Routes.scala",
  crossTarget.value / "routes" / "main" / "router" / "RoutesPrefix.scala"
)
