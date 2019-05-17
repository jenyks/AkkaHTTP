name := "AkkaHTTP"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http"            % "10.1.8",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.8",
  "com.typesafe.akka" %% "akka-http-xml"        % "10.1.8",
  "com.typesafe.akka" %% "akka-stream"          % "2.5.22",

  "com.typesafe.akka" %% "akka-http-testkit"    % "10.1.8" % Test,
  "com.typesafe.akka" %% "akka-testkit"         % "2.5.22" % Test,
  "com.typesafe.akka" %% "akka-stream-testkit"  % "2.5.22" % Test,
  "org.scalatest"     %% "scalatest"            % "3.0.5"  % Test
  
)