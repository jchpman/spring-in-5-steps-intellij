package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDao;

public class SpringIn5StepsXmlContextApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);


	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		LOGGER.info("Beans that were loaded -> {}",
				(Object)applicationContext.getBeanDefinitionNames());
		
		XmlPersonDao personDao = applicationContext.getBean(XmlPersonDao.class);
		
//		System.out.println(personDao);
//		System.out.println("^^^^^ " + personDao.getXmlJdbcConnection() + " ^^^^^");
		
		LOGGER.info("{} {}", personDao, personDao.getXmlJdbcConnection());


		applicationContext.close();
		
	}

}
