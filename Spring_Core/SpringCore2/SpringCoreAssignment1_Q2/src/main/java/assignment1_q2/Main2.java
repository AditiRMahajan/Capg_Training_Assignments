package assignment1_q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
	private static ApplicationContext context;

	public static void main(String[] args) {
		 context = new ClassPathXmlApplicationContext("beans.xml");
	      Collection c = (Collection)context.getBean("collection");
	      
	        c.showList();
			System.out.println("***********************");
			c.showSet();
			System.out.println("***********************");
			c.showMap();
	    }
}
