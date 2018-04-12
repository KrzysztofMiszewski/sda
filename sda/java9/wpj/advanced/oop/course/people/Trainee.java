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
	
	public void sit(){
		this.myChair.setUseOfChair(true);
	}
	
	public void stand(){
		this.myChair.setUseOfChair(false);
	}
	
    public Trainee() {}
    
    public Trainee(String name) {
        this.name = name;
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

    public void setName(String name) {
        this.name = name;
    }
	
	public void setMyChair(Chair chair){
		this.myChair = chair;
	}
	
}