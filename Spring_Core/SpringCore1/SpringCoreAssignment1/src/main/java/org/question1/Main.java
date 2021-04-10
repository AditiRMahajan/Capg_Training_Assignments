package org.question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("customer.xml");
		Customer cust = (Customer) context.getBean("customer1");
		cust.getCustomerDetails();
      
	}

}