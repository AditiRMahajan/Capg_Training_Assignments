package streams;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fruits = Data.getAllFruits();
		//Displaying the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories
		List<Fruit> finalfruit = fruits.stream()
								.filter(fruit -> fruit.getCalories() < 100)
								.sorted(Comparator.comparing(Fruit::getCalories).reversed())
								.collect (Collectors.toList());
		System.out.println("1.Fruit Names of low calories in descending order:\n "+finalfruit);
		
		
		//Displaying color wise list of fruits
		Map<String,List<Fruit>> colorWiseFruits = fruits.stream()
												.collect(Collectors.groupingBy(Fruit::getColor)); 
		System.out.println("\n2.Color wise list of fruits:\n "+colorWiseFruits);
		
		
		//Displaying only RED color fruits sorted as per their price in ascending order
		List<Fruit> colorfruit = fruits.stream()
				.filter(fruit -> fruit.getColor().equals("Red"))
				.sorted(Comparator.comparing(Fruit::getPrice))
				.collect (Collectors.toList());
		System.out.println("\n3.RED color fruits in ascending order of their price:\n "+colorfruit);
		
		
		List<News> news = Data.getAllNews();
		//Find out the newsId which has received maximum comments
		Integer newsId = news.stream()
				.collect(Collectors.groupingBy(News::getNewsId,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey(); 
		System.out.println("\n4.newsId with maximum comments:\n"+newsId);
		
		//Find out how many times the word 'budget' arrived in user comments of all news. Assume that ‘budget’ word has arrived only once in a given user comment
		Long wordCount = news.stream().filter(news1 -> news1.getComment().contains("budget")).count();
		System.out.println("\n5.word 'budget' arrived in user comments:\n"+wordCount);
		
		//Find out which user has posted maximum comments.
				String postname = news.stream()
						.collect(Collectors.groupingBy(News::getPostedByUser,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey(); 
				System.out.println("\n6.User posted maximum comments:\n"+postname);
		
		
		//Displaying commentByUser wise number of comments
		Map<String,Long> commentByUser = news.stream()
				.collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting())); 
		System.out.println("\n7.CommentByUser wise no. of comments:\n"+commentByUser);
		
		
		List<Transaction> transaction = Data.getAllTransactions();
		//Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> tran = transaction.stream()
				.filter(transactions -> transactions.getYear()==2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect (Collectors.toList());
		System.out.println("\n8.All transactions in sorted order in the year 2011:\n"+tran);

		//What are all the unique cities where the traders work?
		List<String> uniqueCities=transaction.stream()
									.map(Transaction::getTrader)
									.map(Trader::getCity)
									.distinct()
									.collect(Collectors.toList());
		System.out.println("\n9.Unique cities where traders work:\n"+uniqueCities);
		
		//Find all traders from Pune and sort them by name.
		List<Trader> name=transaction.stream()
						.filter(city->city.getTrader().getCity().equals("Pune"))
						.map(Transaction::getTrader)
						.sorted(Comparator.comparing(Trader::getName))
						.collect(Collectors.toList());
		System.out.println("\n10.Traders from Pune sorted by name:\n"+name);
		
		//Return a string of all traders’ names sorted alphabetically
		String namesort=transaction.stream()
				.map(Transaction::getTrader)
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList()).toString();
		System.out.println("\n11.String of all trader's name sorted alphabetically:\n"+namesort);
		
		
		//Are any traders based in Indore?
		Optional<Trader> indoreTraders = transaction.stream()
				.filter(city -> city.getTrader().getCity() == "Indore")
				.map(Transaction::getTrader)	
				.findAny();
		System.out.println("\n12.Traders based in Indore:\n"+indoreTraders);
		
		//Print all transactions’ values from the traders living in Delhi
				Optional<Transaction> delhiTraders =transaction
						.stream()
						.filter(cityName->cityName.getTrader().getCity().equalsIgnoreCase("delhi"))
						.findAny();
			System.out.println("\n13.Transactions’ values from the traders living in Delhi:\n"+delhiTraders.isPresent());

			//What’s the highest value of all the transactions?
			Integer  highestTransaction = transaction.stream()
								.collect(Collectors.groupingBy(value->value.getValue(),Collectors.counting()))
								.entrySet()
								.stream()
								.max(Map.Entry.comparingByKey()).get().getKey();;
		System.out.println("\n14.Transaction with Highest Value :\n"+highestTransaction);
		

		//What’s the lowest value of all the transactions?
		Integer  lowestTransaction = transaction.stream()
							.collect(Collectors.groupingBy(value->value.getValue(),Collectors.counting()))
							.entrySet()
							.stream()
							.min(Map.Entry.comparingByKey()).get().getKey();;
		System.out.println("\n15.Transaction with lowest Value :\n"+lowestTransaction);
		 
		
		
		
	}

}