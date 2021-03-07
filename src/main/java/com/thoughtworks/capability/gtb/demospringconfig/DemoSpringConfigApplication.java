package com.thoughtworks.capability.gtb.demospringconfig;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.ResponseStatus;

@ConfigurationPropertiesScan
@SpringBootApplication
@RequiredArgsConstructor
public class DemoSpringConfigApplication implements ApplicationRunner {

	private final MailConfig mailConfig;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringConfigApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(mailConfig);
	}
}
