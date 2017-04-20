package org.oneclicklabs.springboot.config;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "org.oneclicklabs.springboot")
public class Application {


	private static final Logger logger = Logger.getLogger(Application.class);

	public static void main(String[] args) {

		if (logger.isDebugEnabled()) {
			logger.debug("entering main(String[])");
			logger.debug("args: " + args);
		}
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		System.out.println("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting main()");
		}

	}
}
