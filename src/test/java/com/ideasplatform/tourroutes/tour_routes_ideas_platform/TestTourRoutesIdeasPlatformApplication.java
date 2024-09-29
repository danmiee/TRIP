package com.ideasplatform.tourroutes.tour_routes_ideas_platform;

import org.springframework.boot.SpringApplication;

public class TestTourRoutesIdeasPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.from(TourRoutesIdeasPlatformApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
