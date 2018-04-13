package sda.java9.wpj.advanced.oop.course.items;

public class Kitchen{
	
	private Cup[] cups;
	private CoffeeMachine coffeeMachine;
	private WaterMachine waterMachine;
	private Trainee[] trainees;
	
	public Kitchen(){
		cups = new Cup[20];
		for (int i = 0; i < cups.length; i++){
			cups[i] = new Cup();
		}
		coffeeMachine = new CoffeeMachine();
		waterMachine = new WaterMachine();
	}
	
	public void getCups(){
		return cups;
	}
	
	public void getCoffeeMachine(){
		return coffeeMachine;
	}
	
	public void getWaterMachine(){
		return waterMachine;
	}
	
	public void getTrainees(){
		return trainees;
	}
	
	public Cup[] setCups(Cup[] cups){
		this.cups = cups;
	}
	
	public void setCoffeeMachine(CoffeeMachine coffeeMachine){
		this.coffeeMachine = coffeeMachine;
	}
	
	public void setWaterMachine(WaterMachine waterMachine){
		this.waterMachine = waterMachine;
	}
	
	public void setTrainees(Trainee[] trainees){
		this.trainees = trainees;
	}
}