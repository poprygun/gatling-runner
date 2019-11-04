package io.microsamples.load.gatlingrunner;

import io.gatling.app.Gatling;
import io.microsamples.testz.simulation.GetRootsSimulation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

class GatlingRunnerApplicationTests {

	@Test
	void contextLoads() {
		String[] args = {"-s", "io.microsamples.testz.simulation.GetRootsSimulation"
				, "-rf", "src/main/resources/static"};
		Gatling.main(args);
	}

}
