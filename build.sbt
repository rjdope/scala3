scalaVersion := "3.10.0"

lazy val root = rootProject
  .settings(
    name := "Scala-practice",
    libraryDependencies ++= Seq(
      //You can add library dependencies here, for example,
      //"org.scalatest" %% "scalatest" % "3.2.19" % Test,
      //"org.scalameta" %% "munit" % "1.2.3" % Test

      // Apache Pekko
      "org.apache.pekko" %% "pekko-actor-typed" % "1.1.5",
      "org.apache.pekko" %% "pekko-stream" % "1.1.5",
      "org.apache.pekko" %% "pekko-http" % "1.4.2",

      // Cats
      "org.typelevel" %% "cats-core" % "2.13.0",
      "org.typelevel" %% "cats-effect" % "3.6.3",

      // Doobie
      "org.tpolecat" %% "doobie-core" % "1.0.0-RC8",
      "org.tpolecat" %% "doobie-hikari" % "1.0.0-RC8",
      "org.tpolecat" %% "doobie-postgres" % "1.0.0-RC8"
    )
  )
