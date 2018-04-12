package sda.java9.wpj.advanced.oop.course.items;

public class Chair {

	private String color;
	private int numberOfLegs;			
	private boolean backrestOfTheChair;	//oparcie
	private boolean useOfChair;			//czy krzesło jest użyte
	
	
	public boolean getUseOfChair(){
		return useOfChair;
	}
	public void setUseOfChair(boolean useOfChair){
		this.useOfChair = useOfChair;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	
	public int getNumberOfLegs(){
		return numberOfLegs;
	}
	
	public void setNumberOfLegs(int numberOfLegs){
		this.numberOfLegs = numberOfLegs;
	}
	
	public boolean getBackrestOfTheChair(){
		return backrestOfTheChair;
	}
	public void setBackrestOfTheChair(boolean backrestOfTheChair){
		this.backrestOfTheChair = backrestOfTheChair;
	}
	
	

	
	
	
}
    
