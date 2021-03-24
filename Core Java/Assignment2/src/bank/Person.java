package bank;

import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		Saving s = new  Saving(200,"Smith",2000);
		Current c = new  Current(300,"Kathy",3000);
		Account1 acc = s;
		Account1 acc1 = c;
		acc.showAccount1();
		System.out.println("------------");
		acc1.showAccount1();
		System.out.println("------------");
		System.out.println("Initial Balance:");
		s.getBalance();
		System.out.println("Initial Balance:");
		c.getName();
		c.getBalance();
		
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter deposit amount:");
		double depositamt = sc.nextDouble();
		System.out.println("Adding amount" +depositamt);
		s.deposit(depositamt);
		System.out.println("Balance after deposit");
		s.getBalance();
		System.out.println("Balance after deposit:");
		c.getBalance();
		sc.close();
	}
		
		
	}