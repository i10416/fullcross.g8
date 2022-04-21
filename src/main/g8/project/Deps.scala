import sbt._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

object Deps {
  val munit = Def.setting(
    Seq(
      "org.scalameta" %%% "munit" % "1.0.0-M1"
    )
}
