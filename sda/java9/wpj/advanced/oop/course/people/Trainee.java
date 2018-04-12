package sda.java9.wpj.advanced.oop.course.people;

import sda.java9.wpj.advanced.oop.course.rooms.*;
import sda.java9.wpj.advanced.oop.course.content.*;
import sda.java9.wpj.advanced.oop.course.items.*;

public class Trainee 
{
    private String name;
    private boolean fullTrainiesCup;
    private ClassRoom classRoom;
	private Chair myChair;
	private char plec;
    
    public String sayGreetings() {
		
		String greet = "No witam witam, dzien dobry. Jestem " + this.name;
        return greet; 
	}

    public boolean enter(ClassRoom ourRoom) {
		if (ourRoom.getIsOpen()) {
			this.classRoom = ourRoom;
            ourRoom.addTrainee(this);
            return true;
		}	
		else {
			return false;
		}
    }    
	
	public void goToilet(Toilet toilet){
		if (toilet.getOccupant() == null){
			toilet.setOccupant(this);
		} else {
			toilet.placeInLine(this);
		}
	}
	
	public void sit(){
		this.myChair.setUseOfChair(true);
	}
	
	public void stand(){
		this.myChair.setUseOfChair(false);
	}
	
    public Trainee() {}
    
    public Trainee(String name, char plec) {
        this.name = name;
		this.plec = plec;
    }
    
    public String getName() {
        return name;
    }

    public boolean getFullTrainiesCup() {
        return fullTrainiesCup;
    }
	
	public Chair getMyChair(){
		return myChair;
	}
	
	public char getPlec(){
		return plec;
	}

    public void setName(String name) {
        this.name = name;
    }
	
	public void setPlec(char plec){
		this.plec = plec;
	}
	
	public void setMyChair(Chair chair){
		this.myChair = chair;
	}
	
}