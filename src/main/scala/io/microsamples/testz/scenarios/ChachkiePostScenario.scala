package io.microsamples.testz.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.microsamples.load.gatlingrunner.GatlingContext

object ChachkiePostScenario {

  val chachkiesPath = http("Post remote chachkies")
    .post("/remote-chachkies")
    .body(StringBody(GatlingContext.INSTANCE.payload))
    .check(status is 200)

  val chachkiesRoot = scenario("Post Remote Chachkies")
    .exec(chachkiesPath)
}
