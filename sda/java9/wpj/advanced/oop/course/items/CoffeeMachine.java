package sda.java9.wpj.advanced.oop.course.items;

public class CoffeeMachine {
	
	//
	private boolean water;
	private boolean coffe;
	private boolean milk;
	private boolean energy;
	
	public CoffeeMachine (boolean water, boolean coffe,boolean milk,boolean energy){
		this.water = water;
		this.coffe = coffe;
		this.milk = milk;
		this.energy = energy;
	}
	
	public boolean getWater() {
		return water;
	}
	
	public boolean getCoffe() {
		return coffe;
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
	
	public void setCoffe(boolean coffe) {
        this.coffe = coffe;
    }
	
	public void setMilk(boolean milk) {
        this.milk = milk;
    }
	
	public void setEnergy(boolean energy) {
        this.energy = energy;
    }

    
}