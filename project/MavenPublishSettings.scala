import sbt.Keys._
import sbt._
import _root_.io.crashbox.gpg.SbtGpg.autoImport.gpgOptions

object MavenPublishSettings {
  lazy val mavenPublishSettings: List[Def.Setting[_]] = List(
    /**
     * Publishing information
     *
     * In order to publish, follow the steps at https://www.scala-sbt.org/release/docs/Using-Sonatype.html
     *
     */
    organization := "io.carpe",
    organizationName := "Carpe Data",
    organizationHomepage := Some(url("https://carpe.io/")),

    scmInfo := Some(
      ScmInfo(
        url("https://github.com/carpe/parseback"),
        "scm:git@github.com:carpe/parseback.git"
      )
    ),
    developers := List(
      Developer(
        id = "djspiewak",
        name = "Daniel Spiewak",
        email = "djspiewak@gmail.com",
        url = url("https://github.com/djspiewak")
      ),
      Developer(
        id = "SwiftEngineer",
        name = "Taylor Brooks",
        email = "taylor.brooks@carpe.io",
        url = url("https://github.com/SwiftEngineer")
      )
    ),

    description := "A Scala implementation of parsing with derivatives",
    licenses := List("Apache-2.0" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt")),
    homepage := Some(url("https://github.com/carpe/parseback")),
    organizationHomepage := Some(url("https://www.carpe.io/")),

    // Remove all additional repository other than Maven Central from POM
    pomIncludeRepository := { _ => false },
    publishTo := {
      val nexus = "https://oss.sonatype.org/"
      if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
      else Some("releases" at nexus + "service/local/staging/deploy/maven2")
    },
    publishMavenStyle := true,

    gpgOptions := Seq(
      "--no-tty", "--batch"
    )

  )
}
