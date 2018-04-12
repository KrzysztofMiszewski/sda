package sda.java9.wpj.advanced.oop.course.content;

import sda.java9.wpj.advanced.oop.course.people.Trainee;
import sda.java9.wpj.advanced.oop.course.content.CourseBlock;

public class Course {
    
    private String title;
    private String shortDescription;
    private String longDescription;
    private Trainee[] trainies;
    private CourseBlock[] blocks;
    
    public String getTitle() {
        return title;
    }
    
    public String getShortDescription() {
        return shortDescription;
    }
    
    public String getLongDescription() {
        return longDescription;
    }
    
    public Trainee[] getTrainies() {
        return trainies;
    }
    
    public CourseBlock[] getBlocks() {
        return blocks;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    
    public void setTrainies(Trainee[] trainies) {
        this.trainies = trainies;
    }
    
    public void setBlocks(CourseBlock[] blocks) {
        this.blocks = blocks;
    }
    
}