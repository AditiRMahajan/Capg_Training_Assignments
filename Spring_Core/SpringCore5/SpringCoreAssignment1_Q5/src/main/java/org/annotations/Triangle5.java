package org.annotations;

public class Triangle5 {
	
	private String type;
	private int height;	
	
	public int getHeight() {
		return height;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void draw() {
		
		System.out.println(getType() + " Triangle Drawn of height " + getHeight());
	}

}