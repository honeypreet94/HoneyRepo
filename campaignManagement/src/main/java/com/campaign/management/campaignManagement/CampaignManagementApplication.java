package com.campaign.management.campaignManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.campaign.management")
@EntityScan("com.campaign.management")
@EnableJpaRepositories(basePackages={"com.campaign.management"})
public class CampaignManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampaignManagementApplication.class, args);
	}

}
