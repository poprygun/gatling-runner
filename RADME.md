## Make sure gatling Uber jar dependency is added.

mvn install:install-file -Dfile=<path-to-file> -DgroupId=io.microsamples.testz \
    -DartifactId=load -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar