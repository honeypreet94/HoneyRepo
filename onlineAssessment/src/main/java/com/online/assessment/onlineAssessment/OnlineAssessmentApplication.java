package com.online.assessment.onlineAssessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.online.assessment")
@EntityScan("com.online.assessment")
@EnableJpaRepositories(basePackages={"com.online.assessment"})
public class OnlineAssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineAssessmentApplication.class, args);
	}

}
