package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

public class SpringIn5StepsXmlContextApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			LOGGER.info("Beans loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
			
			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info(xmlPersonDAO.toString());
			LOGGER.info(xmlPersonDAO.getJdbcConnection().toString());
		}
	}
}
