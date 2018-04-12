package sda.java9.wpj.advanced.oop.course.items;

public class WaterMachine {
		

	private int capacity;
	private int coldWater;
	private int hotWater;

	public WaterMachine (int capacity, int coldWater, int hotWater){
		
	this.capacity = capacity;
	this.coldWater = coldWater;
	this.hotWater = hotWater;
	
	}
	
	public WaterMachine() {}
	
	public int getCapacity() {
		return capacity;
	}
	public int getColdWater(){
		return coldWater;
	}
	public int getHotWater(){
		return hotWater;
	}
	
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}
	public void setColdWater(int coldWater){
		this.coldWater = coldWater;
	}
	public void setHotWater(int hotWater){
		this.hotWater = hotWater;
	}
	
	
}