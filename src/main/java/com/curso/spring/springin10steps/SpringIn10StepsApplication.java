package com.curso.spring.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn10StepsApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext =  SpringApplication.run(SpringIn10StepsApplication.class, args);
		BinarySearchImpl binarySearchBean = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearchBean.binarySearch(new int[]{12, 3, 4, 6}, 3);

		System.out.println(result);
	}

}
