package io.microsamples.load.gatlingrunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication
public class GatlingRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatlingRunnerApplication.class, args);
	}


}
