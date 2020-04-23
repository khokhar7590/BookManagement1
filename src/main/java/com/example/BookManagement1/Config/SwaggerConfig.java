package com.example.BookManagement1.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket getSwaggerConfig() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				//.apis(RequestHandlerSelectors.basePackage("com.example.BookManagement1"))
				.build()
				.apiInfo(getApiInfo());
	}
	
	@SuppressWarnings("deprecation")
	private ApiInfo getApiInfo() {
		return new ApiInfo("Book Management Api", "Api for Book Management", 
				"1.0", "Personal Use", "Deepak Khokhar", "License", "http://google.com");
	}

}
