package sda.java9.wpj.advanced.oop.course.items;

public class Board {
    
	private boolean clean;
	private boolean sponge;
	private boolean freeSpace;
	private String boardColor;

	
	public boolean getClean(){
		return clean;
	}
	
	public boolean getSponge(){
		return sponge;
	}
	
	public boolean getFreeSpace(){
		return freeSpace;
	}
	
	public String getBoardColor(){
		return boardColor;
	}
	
	public void setClean(boolean clean){
		this.clean = clean;
	}
	
	public void setSponge(boolean sponge){
		this.sponge = sponge;
	}
	
	public void setFreeSpace(boolean freeSpace){
		this.freeSpace = freeSpace;
	}
	
	public void setBoardColor(String boardColor){
		this.boardColor = boardColor;
	}
}
	
	
	
	
	
	
	
	
	
	