package io.microsamples.testz.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object RemoteChachkiesScenario {

  val chachkiesPath = http("get remote chachkies")
    .get("/remote-chachkies")
    .check(status is 200)

  val chachkiesRoot = scenario("Get Remote Chachkies")
    .exec(chachkiesPath)
}
