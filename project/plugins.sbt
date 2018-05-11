// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.2")

//addSbtPlugin("com.solinor.sbt" % "sbt-cxf" % "1.1")
addSbtPlugin("io.paymenthighway.sbt" % "sbt-cxf" % "1.4")
