package sda.java9.wpj.advanced.oop.course.rooms;

import sda.java9.wpj.advanced.oop.course.people.*;
import sda.java9.wpj.advanced.oop.course.items.*;
import sda.java9.wpj.advanced.oop.course.rooms.*;

public class ClassRoom {
    
	private Board board;
	private Chair[] chairs;
	private Table[] tables;
	private CourseManager courseManager;
	private Trainee[] trainees;
	private Trainer trainer;
	private boolean isOpen; 
    
	public void addTrainee(Trainee trainee){
		boolean added = false;
		for (int i = 0; i < this.trainees.length; i++){
			if (this.trainees[i] == null) {
				trainees[i] = trainee;
				added = true;
                break;
			}
		}
		if (added = true) {
			System.out.println("[DEBUG] Dodano uczestnika: " + trainee.getName());
		} else {
			System.out.println("[DEBUG] Brak miejsca");
		}
		
	}
	
	public void removeTrainee(Trainee trainee){
		Boolean removed = false;
		for (int i = 0; i < this.trainees.length; i++){
			if (this.trainees[i] == trainee) {
				trainees[i] = null;
				removed = true;
				break;
			}
		}
		if (removed = true) {
			System.out.println("[DEBUG] Usunieto uczestnika: " + trainee.getName());
		} else {
			System.out.println("[DEBUG] Nie znaleziono uczestnika: " + trainee.getName());
		}
	}
	
	public void addTable(Table table){
		Boolean added = false;
		for (int i = 0; i < this.tables.length; i++){
			if (this.tables[i] == null) {
				tables[i] = table;
				added = true;
                break;
			}
		}
		if (added = true) {
			System.out.println("[DEBUG] Dodano stol");
		} else {
			System.out.println("[DEBUG] Brak miejsca");
		}
	}
	
	public void addChair(Chair chair){
		Boolean added = false;
		for (int i = 0; i < this.chairs.length; i++){
			if (this.chairs[i] == null) {
				chairs[i] = chair;
				added = true;
                break;
			}
		}
		if (added = true) {
			System.out.println("[DEBUG] Dodano krzeslo");
		} else {
			System.out.println("[DEBUG] Brak miejsca");
		}
	}
	
	public void addTableWithChairs(Table table){
		addTable(table);
		if (table.getFirstChair() != null){
			addChair(table.getFirstChair());
		}
		if (table.getSecondChair() != null){
			addChair(table.getSecondChair());
		}
	}
	
	public void addTableWithChairs(Table[] tables){
		for (int i = 0; i < tables.length; i++) {
			if (tables[i] != null){
				addTableWithChairs(tables[i]);
			} else {
				break;
			}
		}
	}
	
	public ClassRoom(int roomSize){
		trainees = new Trainee[roomSize];
        tables = new Table[roomSize / 2 + 1];
        chairs = new Chair[tables.length * 2];
        for (int i = 0; i < chairs.length; i++) {
            chairs[i] = new Chair();
        }
        for (int i = 0; i < tables.length; i++) {
            tables[i] = new Table();
            tables[i].setFirstChair(chairs[i * 2]);
            tables[i].setSecondChair(chairs[i * 2 + 1]);
            /*
            Chair freeChair = takeFreeChair();
            tables[i].setFirtsChair(freeChair);
            freeChair = tabkeFreeChair();
            tables[i].setSecondChair(freeChair);
            */
        }
	}
	
	public ClassRoom (int roomSize, int numberOfTables){
		trainees = new Trainee[roomSize];
		tables = new Table[numberOfTables];
		chairs = new Chair[(2 * numberOfTables)];
	}
	
	public boolean getIsOpen(){
		return isOpen;
	}
	
	public Board getBoard(){
		return board;
	}
	
	public Chair[] getChair(){
		return chairs;
	}
	
	public Table[] getTable(){
		return tables;
	}
	
	public CourseManager getCourseManager(){
		return courseManager;
	}
	
	public Trainee[] getTrainees(){
		return trainees;
	}
	
	public Trainer getTrainer(){
		return trainer;
	}
	
	public void setIsOpen(boolean isOpen){
		this.isOpen = isOpen;
	}
	
	public void setBoard(Board board){
		this.board = board;
	}
	
	public void setChair(Chair[] chairs){
		this.chairs = chairs;
	}
	
	public void setTable(Table[] tables){
		this.tables = tables;
	}
	
	public void setCourseManager(CourseManager courseManager){
		this.courseManager = courseManager;
	}
	
	public void setTrainees(Trainee[] trainees){
		this.trainees = trainees;
	}
	
	public void setTrainer(Trainer trainer){
		this.trainer = trainer;
	}
}