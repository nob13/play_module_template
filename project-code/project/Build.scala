import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "myplaymodule"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    cache
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    organization := "my.organisation"
  )
}

