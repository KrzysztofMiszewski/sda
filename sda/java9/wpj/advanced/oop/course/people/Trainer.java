package sda.java9.wpj.advanced.oop.course.people;

import sda.java9.wpj.advanced.oop.course.rooms.*;
import sda.java9.wpj.advanced.oop.course.items.*;
import sda.java9.wpj.advanced.oop.course.content.*;

public class Trainer {
    
    private String name;
    private ClassRoom classRoom;
    
    public void openRoom(ClassRoom room) {
        room.setIsOpen(true);
    }
    
    public void enterRoom(ClassRoom room) {
        if (!room.getIsOpen()) {
            if (room.getTrainer() != null) {
                throw new IllegalStateException("Trener juz jest w pokoju!");
            }
            this.openRoom(room);
        }
        this.classRoom = room;
        room.setTrainer(this);
    }  
    
    public String sayGreetings() {
        String greet = "Witajcie!";
        greet += "\n\nBądźcie pozdrowieni szczęśliwi, którzy trafiliście na te zajęcia!";
        greet += "\nJESTEM... " + this.name.toUpperCase();
        return greet;
    }
	
	public String sayMyCourseBlocksInfo(Course course) {
        String info = "";
        for (CourseBlock block : course.getBlocks()) {
            // Sprawdzenie czy trener przypisany do kursu jest trenerem,
            // na którym wywołaliśmy tą metodę)
            if (block.getTrainer() == this) {
                info += "Blok " + block.getTitle() + " to " + block.getShortDescription() 
                    + ". Gdyby powiedzieć coś o nim więcej, to jest to " + block.getLongDescription() + "\n";
            }
        }
        return info;
    }
	
	public void displayCourse(Projector projector, String msg){
		projector.setScreen(msg);
	}
	
	public void cleanBoard(Board board){
		board.setMsg("");
	}
	
	public String sayCourseDetails(Course course) {
        return "Co więcej można powiedzieć o kursie " + course.getTitle() + "? " + course.getLongDescription();
    }
	
	public void turnProjectorOn(Projector projector){
		projector.setIsOn(true);
	}
    
    public Trainer() {}
    
    public Trainer(String name) {
        this.name = name;
    }
    
    public ClassRoom getRoom() {
        return classRoom;
    }  
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}