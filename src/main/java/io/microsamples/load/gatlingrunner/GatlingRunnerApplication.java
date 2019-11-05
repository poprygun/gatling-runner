package io.microsamples.load.gatlingrunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class GatlingRunnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatlingRunnerApplication.class, args);
    }


}

@Controller
class SimpleController {

    @GetMapping("/reports")
    public String reports(Model model) {
        File[] directories = new File("src/main/resources/static").listFiles(File::isDirectory);
        final List<String> reports = Arrays.asList(directories).stream().map(File::getName).collect(Collectors.toList());
        model.addAttribute("reports", reports);
        return "index";
    }
}
