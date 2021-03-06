package sda.java9.wpj.advanced.oop.course.content;

import sda.java9.wpj.advanced.oop.course.people.Trainer;

public class CourseBlock {
    
    private String title;
    private String shortDescription;
    private String longDescription;
    private String[] slides;
    private Trainer trainer;
    
    public CourseBlock(String title, String shortDescription) {
        this.title = title;
        this.shortDescription = shortDescription;
    }
    
    public CourseBlock(String title, String shortDescription, String longDescription) {
        this(title, shortDescription);
        this.longDescription = longDescription;
    }
    
    public CourseBlock(String title, String shortDescription, String longDescription, Trainer trainer) {
        this(title, shortDescription, longDescription);
        this.trainer = trainer;
    }
	
	public String getTitle() {
        return title;
    }
    
    public String getShortDescription() {
        return shortDescription;
    }
    
    public String getLongDescription() {
        return longDescription;
    }
    
    public String[] getSlides() {
        return slides;
    }
    
    public Trainer getTrainer() {
        return trainer;
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
    
    public void setSlides(String[] slides) {
        this.slides = slides;
    }
    
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}