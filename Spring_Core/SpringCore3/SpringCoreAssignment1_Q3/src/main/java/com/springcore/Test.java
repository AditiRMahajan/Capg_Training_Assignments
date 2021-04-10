package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beans.xml");
		BankAccountRepositoryImpl repo = (BankAccountRepositoryImpl) context.getBean("Accounts");
		repo.getBalance(1);
		repo.updateBalance(1, 1000);
		
		BankAccountServiceImpl service = (BankAccountServiceImpl) context.getBean("BankAccountService");
		service.withdraw(2, 500);
		service.fundTransfer(2, 1, 1000);
		service.getBalance(1);
	}

}