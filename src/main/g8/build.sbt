val V = new {
  val scala212 = "2.12.15"
  val scala213 = "2.13.8"
  val scala30 = "3.0.2"
  val scala31 = "3.1.1"
}

resolvers += Resolver.sonatypeRepo("snapshots")

inThisBuild(
  Seq(
    organization := "$org$",
    scalaVersion := V.scala31,
    licenses := List(
      "Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0")
    ),
    homepage := Some(url("$homepage$")),
    versionScheme := Some("early-semver"),
    developers := List(
      Developer(
        "$githubId$",
        "$username$",
        "$mailaddress$",
        url("https://github.com/$githubId$")
      )
    ),
    sonatypeCredentialHost := "s01.oss.sonatype.org",
    sonatypeRepository := "https://s01.oss.sonatype.org/service/local",
    scmInfo := Some(
      ScmInfo(
        url("$githubRepo$"),
        "scm:$githubSSH$"
      )
    )
  )
)

lazy val root = (project in file(".")).settings(
  name := "$name$"
)

lazy val core = (projectMatrix in file("core"))
  .settings(
    name := "core"
  )
  .jvmPlatform(scalaVersions =
    Seq(V.scala212, V.scala213, V.scala30, V.scala31)
  )
  .jsPlatform(scalaVersions = Seq(V.scala212, V.scala213, V.scala30, V.scala31))
  .nativePlatform(scalaVersions = Seq(V.scala212, V.scala213, V.scala31))
