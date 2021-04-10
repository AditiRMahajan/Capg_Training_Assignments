package org.annotations;

import org.springframework.beans.factory.annotation.Required;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Circle implements Shape5 {
	
	private Point center;

	public Point getCenter() {
		return center;
	}

	@Required
	@Inject
	@Resource(name="center")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle point is: (" + center.getX() + "," + center.getY() + ")");
		
	}
	
	

}
