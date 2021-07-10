/*
 * Copyright 2017 Daniel Spiewak
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Contains handy sbt settings commonly found among cats/typelevel projects
addSbtPlugin("com.codecommit"     % "sbt-spiewak" % "0.21.0")

// Used for benchmarking
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.4.3")

// Used for cross platform compilation support
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.1.0")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"              % "1.6.0")

// used for publishing to the sonatype repo
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.2")
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.1.2")