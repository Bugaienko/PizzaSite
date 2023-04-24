package ua.bugaienko.pizzaSiteApp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PizzaSiteAppApplication {
	public static void main(String[] args) {

		SpringApplication.run(PizzaSiteAppApplication.class, "--spring.config.name=application-client");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
