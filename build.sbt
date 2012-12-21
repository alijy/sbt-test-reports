name := "sbt-test-reports"

organization := "com.dadrox"

version := "0.1"

sbtPlugin := true

crossScalaVersions := Seq("2.9.1", "2.9.3-RC1", "2.10.0-RC5", "2.9.2")

CrossBuilding.crossSbtVersions := Seq("0.12", "0.11.3")

scalaVersion := "2.9.2"

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }
