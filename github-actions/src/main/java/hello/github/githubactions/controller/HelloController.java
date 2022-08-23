package hello.github.githubactions.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		log.info("Hello Controller - hello method is started");
		return "Hello, AWS!";
	}

	@GetMapping("/hello/{provider}")
	public String helloProvider(@PathVariable(name = "provider") String provider) {
		return "Hello, " + provider + "!!";
	}

	@GetMapping
	public String mainRouting() {
		return "This is main page";
	}
}

