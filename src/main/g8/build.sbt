Global / onChangedBuildSource := ReloadOnSourceChanges

val V = new {
  val scala212 = "2.12.16"
  val scala213 = "2.13.8"
  val scala31 = "3.1.2"
}

resolvers ++= Resolver.sonatypeOssRepos("snapshots")
resolvers ++= Resolver.sonatypeOssRepos("releases")

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

lazy val noPublishSettings = Seq(
  publish := (()),
  publishLocal := (()),
  publishTo := None
)

lazy val root = (project in file("."))
  .settings(noPublishSettings)
  .settings(
    name := "$name$"
  )
  .aggregate(core.projectRefs: _*)

lazy val core = (projectMatrix in file("core"))
  .settings(
    name := "$name$-core",
    scalacOptions ++= {
      if (scalaVersion.value.startsWith("2.12"))
        Seq("-language:higherKinds", "-Ypartial-unification")
      else Nil
    },
    libraryDependencies ++= munit.value.map(_ % Test)
  )
  .jvmPlatform(scalaVersions = Seq(V.scala212, V.scala213, V.scala31))
  .jsPlatform(scalaVersions = Seq(V.scala212, V.scala213, V.scala31))
  .nativePlatform(scalaVersions = Seq(V.scala212, V.scala213, V.scala31))
