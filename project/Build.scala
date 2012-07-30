import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "api"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "com.codahale" % "jerkson_2.9.1" % "0.5.0"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
        resolvers += (
    		Resolver.url("Codahale Repo", url("http://repo.codahale.com"))
		)
    )
}
