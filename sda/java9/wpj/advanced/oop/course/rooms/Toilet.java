package sda.java9.wpj.advanced.oop.course.rooms;

import sda.java9.wpj.advanced.oop.course.people.Trainee;

public class Toilet {
	
    private char plec;
	private Trainee occupant;
	private Trainee[] line;
	
	public Toilet(char plec, int lineLenght){
		this.plec = plec;
		this.line = new Trainee[lineLenght];
	}
	
	public void placeInLine(Trainee trainee){
		for (int i = 0; i < line.length; i++){
			if (this.line[i] == null) {
				line[i] = trainee;
				break;
			}
		}
	}
	
	public void emptyToilet(){
		if (occupant != null){
			occupant.setInToilet(false);
			occupant = null;
		}
		for (int i = 0; i < line.length; i++){
			if (line[i] != null) {
				line[i].setInToilet(false);
				line[i] = null;
			} else {
				break;
			}
		}
	}
	
	public Trainee getOccupant(){
		return occupant;
	}
	
	public Trainee[] getLine(){
		return line;
	}
	
	public void setOccupant(Trainee occupant){
		this.occupant = occupant;
	}
	
	public void setLine(Trainee[] line){
		this.line = line;
	}
}