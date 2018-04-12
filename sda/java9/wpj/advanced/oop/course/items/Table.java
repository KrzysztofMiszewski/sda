package sda.java9.wpj.advanced.oop.course.items;

import sda.java9.wpj.advanced.oop.course.items.Chair;

public class Table {
    
    private int legsCount;
    private String color;
    private Chair firstChair;
    private Chair secondChair;
    
    public int getLegsCount() {
        return this.legsCount;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public Chair getFirstChair() {
        return this.firstChair;
    }
    
    public Chair getSecondChair() {
        return this.secondChair;
    }
    
    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setFirstChair(Chair chair) {
        this.firstChair = chair;
    }
    
    public void setSecondChair(Chair chair) {
        this.secondChair = chair;
    }
}