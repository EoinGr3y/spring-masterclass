package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsComponentApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentApplication.class, args);
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);
		ComponentDAO componentDao2 = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDao);
		LOGGER.info("{}", componentDao.getJdbcConnection());
		
		LOGGER.info("{}", componentDao2);
		LOGGER.info("{}", componentDao2.getJdbcConnection());
	}
}
