lazy val commonSettings = Seq(
                              organization := "knoldus",
                              version := "2.11.12"
                          )
lazy val dependencies = Seq(
  // https://mvnrepository.com/artifact/org.scala-lang/scala-library
                        "org.scala-lang" % "scala-library" % "2.11.12"
)
lazy val Root = project.in(file("."))
                        .aggregate(Application,Datalake,Datapipeline)
                        .settings(
                            name := "Root",
                            commonSettings
                        )
lazy val Application = project.settings(
                                       name := "Application",
                                       commonSettings
                                       )

lazy val Datapipeline = project.settings(
                                          name := "Datapipeline",
                                          commonSettings
                                         )
  lazy val Datalake = project.settings(
                                          name := "Datalake",
                                          commonSettings
                                       )
