package com.spel;

public class Engine {
	
	private int capacity;
    private int horsePower;
    private int numberOfCylinders;
    
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}
	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", horsePower=" + horsePower + ", numberOfCylinders="
				+ numberOfCylinders + "]";
	}
	
	
	
    
    

}
