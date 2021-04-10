package org.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Drawing5 {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("spring.xml");
		Shape5 s = (Shape5) context.getBean("circle",Circle.class);
		s.draw();

	}

}
