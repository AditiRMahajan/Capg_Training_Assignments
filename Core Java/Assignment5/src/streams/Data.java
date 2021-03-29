package streams;

import java.util.ArrayList;
import java.util.List;

public class Data {

	public static List<Fruit> getAllFruits() {
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit("Peach", 90, 50, "Red"));
		fruits.add(new Fruit("Banana", 200, 10, "Yellow"));
		fruits.add(new Fruit("Pomegranate", 200, 70, "Red"));
		fruits.add(new Fruit("Apple", 300, 150, "Red"));
		fruits.add(new Fruit("Watermelon", 30, 20, "Red"));
		return fruits;
	}
	public static void printFruits(List<Fruit> fruits) {
		fruits.stream().forEach(System.out::println);
	}

	public static List<News> getAllNews() {
		List<News> newsList = new ArrayList<News>();
		newsList.add(new News(1, "Aditi", "Aryan", "Very nice article on budget"));
		newsList.add(new News(2, "Anusha", "Nandini", "Good budget description"));
		newsList.add(new News(1, "Aditi", "Rajashri", "How can you write such an article?"));
		newsList.add(new News(2, "Keshav", "Pooja", "I agree with you!!"));
		newsList.add(new News(2, "Poonam", "Aryan", "This seems to be paid news for glorifying the budget"));
		newsList.add(new News(3, "Tejas", "Dikshit", "Good article"));
		return newsList;
	}
	public static void printNews(List<News> newsList) {
		newsList.stream().forEach(System.out::println);
	}

	public static List<Transaction> getAllTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(new Transaction(new Trader("Aditi", "Pune"), 2019, 15000));
		transactions.add(new Transaction(new Trader("Nandini", "Indore"), 2018, 35000));
		transactions.add(new Transaction(new Trader("Atul", "Mumbai"), 2011, 35000));
		transactions.add(new Transaction(new Trader("Anusha", "Delhi"), 2020, 300000));
		transactions.add(new Transaction(new Trader("Keshav", "Pune"), 2011, 60000));
		transactions.add(new Transaction(new Trader("Ishwar", "Indore"), 2017, 18000));
		return transactions;
	}
	
	public static void printTransactions(List<Transaction> transactions) {
		transactions.stream().forEach(System.out::println);
	}
}
