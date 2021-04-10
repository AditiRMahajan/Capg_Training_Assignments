package org.question_1b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_1b {
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("addr_cust_b.xml");
		Customer_1b cust = (Customer_1b) context.getBean("customer2");
		cust.getCustomerDetails();
      
	}

}