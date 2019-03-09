package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerClient {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Customer customer1=context.getBean("c1",Customer.class);
		Customer customer2=context.getBean("c2",Customer.class);
		//Customer customer3=context.getBean("customer3",Customer.class);
		//Customer customer4=context.getBean("customer4",Customer.class);
		customer1.showInfo();
		customer2.showInfo();
		//customer3.showInfo();
	   //customer4.showInfo();
		
		
		
	}

}
