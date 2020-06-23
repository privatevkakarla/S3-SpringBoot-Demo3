package com.veer.springboot.rest.demo3.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(value = "com.veer.springboot.rest.demo3")
@EnableSwagger2
public class S3SpringBootDemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(S3SpringBootDemo3Application.class, args);
	}
	
	@Bean
	public Docket saggerapi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.veer.springboot.rest.demo3.controller")).build();
	}

}
