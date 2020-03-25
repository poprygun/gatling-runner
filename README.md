# Wrapper for Gatling test simulations that can be pushed to CloudFoundry

## Run default simulation

`/run-test`

## Specify simulation to execute

`/run-test?simulation=path.to.my.SimulationClass`

## Post json example

`http post localhost:8080/run-test-post age=127 id=12345 name=Porsche`

## Reports are generated in 

`/reports`
