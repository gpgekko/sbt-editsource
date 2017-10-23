import sbt._

sbtPlugin := true


// Basic application information.
// ---------------------------------------
organization := "com.github.gpgekko"
organizationName := "gpgekko"
organizationHomepage := Some(new URL("https://github.com/gpgekko"))
name := "sbt-editsource"
homepage := Some(new URL("https://github.com/gpgekko/sbt-autoprefixer"))
startYear := Some(2017)

licenses += ("BSD New", url("https://github.com/gpgekko/sbt-editsource/blob/master/LICENSE.md"))


// Scala version to use.
// ---------------------------------------
crossSbtVersions := Seq("0.13.16", "1.0.2")


// ---------------------------------------------------------------------------
// Other dependencies

// External deps
libraryDependencies += "org.clapper" %% "grizzled-scala" % "4.4.1"