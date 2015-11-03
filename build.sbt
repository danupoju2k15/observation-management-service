name := """observation_history"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  //app dependencies
  //  "com.google.guava" % "guava" % "18.0",
  "commons-collections" % "commons-collections" % "3.2.1",
  "commons-beanutils" % "commons-beanutils" % "1.9.2",
  "net.logstash.logback" % "logstash-logback-encoder" % "4.5.1",
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
  "org.avaje.ebeanorm" % "avaje-ebeanorm-typequery" % "1.4.1",
  //test dependencies
  "org.assertj" % "assertj-core" % "3.0.0" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test",
  "junit" % "junit" % "4.12" % "test",
  "net.javacrumbs.json-unit" % "json-unit-fluent" % "1.5.6" % "test",
  "org.powermock" % "powermock-module-junit4" % "1.6.2" % "test",
  "org.powermock" % "powermock-api-mockito" % "1.6.2" % "test"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
