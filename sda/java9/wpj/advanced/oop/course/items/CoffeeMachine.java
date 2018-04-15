package sda.java9.wpj.advanced.oop.course.items;

import sda.java9.wpj.advanced.oop.course.items.Cup;

public class CoffeeMachine {
	
	//
	private boolean water;
	private boolean milk;
	private boolean energy;
	private boolean haveCoffee;
	
	public CoffeeMachine(){
		haveCoffee = true;
	}
	
	public void fill(Cup cup){
		if (haveCoffee == true){
			cup.setEmpty(false);
			cup.setContent("Kawa");
			// if (Math.random() >= 0.9){
				// haveCoffee = false;
				// System.out.println("CoffeeMachine - Brak kawy");
			// }
		}
	}
	
	public boolean getWater() {
		return water;
	}
	
	public boolean getHaveCoffe() {
		return haveCoffee;
	}
	
	public boolean getMilk() {
		return milk;
	}
	
	public boolean getEnergy() {
		return energy;
	}
	
	public void setWater(boolean water) {
        this.water = water;
    }
	
	public void setHaveCoffe(boolean haveCoffee) {
        this.haveCoffee = haveCoffee;
    }
	
	public void setMilk(boolean milk) {
        this.milk = milk;
    }
	
	public void setEnergy(boolean energy) {
        this.energy = energy;
    }

    
}