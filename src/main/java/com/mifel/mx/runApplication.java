package com.mifel.mx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class runApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(runApplication.class, args);
		System.out.println("Entra aqui runApplication");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("configuración");
		return application.sources(runApplication.class);
	}
}
