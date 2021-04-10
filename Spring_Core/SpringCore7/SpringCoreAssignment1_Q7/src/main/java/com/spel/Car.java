package com.spel;

public class Car {
	
	private String make;
    private Engine engine;
    private int horsePower;
    
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}

	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public void display() {
		System.out.println("Made by: "+make+" ,Engine Details: "+engine+" ,HorsePower: "+horsePower);
		
	}
    
    

}
