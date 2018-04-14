package sda.java9.wpj.advanced.oop.course.rooms;

import sda.java9.wpj.advanced.oop.course.people.Trainee;

public class Toilet {
	
    private char plec;
	private Trainee occupant;
	private Trainee[] lain;
	
	public Toilet(char plec, int lainLenght){
		this.plec = plec;
		this.lain = new Trainee[lainLenght];
	}
	
	public void placeInLine(Trainee trainee){
		for (int i = 0; i < lain.length; i++){
			if (this.lain[i] == null) {
				lain[i] = trainee;
				break;
			}
		}
	}
	
	public void emptyToilet(){
		occupant.setInToilet(false);
		occupant = null;
		for (int i = 0; i < lain.length; i++){
			if (lain[i] != null) {
				lain[i].setInToilet(false);
				lain[i] = null;
			} else {
				break;
			}
		}
	}
	
	public Trainee getOccupant(){
		return occupant;
	}
	
	public Trainee[] getLain(){
		return lain;
	}
	
	public void setOccupant(Trainee occupant){
		this.occupant = occupant;
	}
	
	public void setLain(Trainee[] lain){
		this.lain = lain;
	}
}