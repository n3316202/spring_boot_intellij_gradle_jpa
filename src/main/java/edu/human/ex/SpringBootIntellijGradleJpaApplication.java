package edu.human.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBootIntellijGradleJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIntellijGradleJpaApplication.class, args);
	}

}
