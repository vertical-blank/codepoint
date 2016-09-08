import sbt._
import sbt.Keys._

object CodepointBuild extends Build {

  lazy val codepoint = Project(
    id = "codepoint",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "codepoint",
      organization := "vertical.blank",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.2"
      // add other settings here
    )
  )
}
