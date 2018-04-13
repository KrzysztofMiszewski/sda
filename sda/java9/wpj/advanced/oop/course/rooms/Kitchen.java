package sda.java9.wpj.advanced.oop.course.rooms;

import sda.java9.wpj.advanced.oop.course.people.Trainee;
import sda.java9.wpj.advanced.oop.course.items.*;

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
	
	public Cup[] getCups(){
		return cups;
	}
	
	public CoffeeMachine getCoffeeMachine(){
		return coffeeMachine;
	}
	
	public WaterMachine getWaterMachine(){
		return waterMachine;
	}
	
	public Trainee[] getTrainees(){
		return trainees;
	}
	
	public void setCups(Cup[] cups){
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