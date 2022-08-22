package hello.github.githubactions.controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloControllerTest {
	@Test
	void sampleTest() {
		assertThat("Hello World").isEqualTo("Hello World");
	}

}