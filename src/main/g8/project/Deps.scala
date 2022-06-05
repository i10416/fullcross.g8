import sbt._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

object Deps {
  val scalajsStubs = Def.setting(
    Seq(
      "org.scala-js" %%% "scalajs-stubs" % "1.1.0"
    )
  )
  val munit = Def.setting(
    Seq(
      "org.scalameta" %%% "munit" % "1.0.0-M4"
    )
  )
}
