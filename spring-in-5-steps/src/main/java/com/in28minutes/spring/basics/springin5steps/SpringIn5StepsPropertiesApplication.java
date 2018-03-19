package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.spring.basics.springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class);				
		SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
		
		System.out.println(someExternalService);
		String url = someExternalService.returnServiceUrl();
		System.out.println(url);
		
		applicationContext.close();
	}
}
