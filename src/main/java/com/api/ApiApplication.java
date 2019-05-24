package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.controller.ApiController;

@ComponentScan
@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaAuditing
public class ApiApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
    }
	
	@RequestMapping("/")
    String home()	
    {
        return "Hello World!";
    }
	
	 @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(ApiApplication.class);
	  }
}
