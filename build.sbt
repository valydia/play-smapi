
name := """play-smapi"""
organization := "com.example"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.11"


val CxfVersion = "3.1.14"

libraryDependencies ++= Seq(
  guice,
  "org.apache.cxf" % "cxf-core"                 % CxfVersion,
  "org.apache.cxf" % "cxf-rt-frontend-jaxws"    % CxfVersion,
  "org.apache.cxf" % "cxf-rt-transports-http"   % CxfVersion,
  "eu.sipria.play" %% "play-guice-cxf_play26" % "1.6.0",
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
)



version in CXF := CxfVersion


wsdls in wsdl2java := Seq(
  Wsdl("SmapiService", (resourceDirectory in Compile).value / "Sonos.wsdl", Seq(
    "-p", "services.com.sonos.smapi", "-wsdlLocation", "conf/Sonos.wsdl"
  ))
)

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .enablePlugins(CxfPlugin)
