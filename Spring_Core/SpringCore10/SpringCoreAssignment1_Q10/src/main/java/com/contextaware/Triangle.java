package com.contextaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private ApplicationContext context = null;
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
		}
	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
		}
	
	public void setPointC(Point pointC) {
		this.pointC = pointC;
		}
	
	public void draw() {
		System.out.println("PointA is ("+pointA.getX()+", "+pointA.getY()+")");
		System.out.println("PointB is ("+pointB.getX()+", "+pointB.getY()+")");
		System.out.println("PointC is ("+pointC.getX()+", "+pointC.getY()+")");
		}
	
	public void setBeanName(String name, ApplicationContext context) {
		this.context = context;
		}
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		}
	
	
}