package sda.java9.wpj.advanced.oop.course.items;

import sda.java9.wpj.advanced.oop.course.items.Cup;

public class WaterMachine {
		

	private int capacity;
	private boolean haveWater;
	
	public WaterMachine() {
		haveWater = true;
	}
	
	public void fill(Cup cup){
		if (haveWater == true){
			cup.setEmpty(false);
			cup.setContent("Woda");
			if (Math.random() >= 0.9){
				haveWater = false;
			}
		}
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}
	
}