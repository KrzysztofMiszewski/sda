package sda.java9.wpj.advanced.oop.course.items;

public class Board {
    
	private boolean clean;
	private boolean sponge;
	private boolean freeSpace;
	private String msg;

	public Board() {
		msg = "5 + 3 * 12";
	}
	
	public boolean getClean(){
		return clean;
	}
	
	public boolean getSponge(){
		return sponge;
	}
	
	public boolean getFreeSpace(){
		return freeSpace;
	}
	
	public String getMsg(){
		return msg;
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
	
	public void setMsg(String msg){
		this.msg = msg;
	}
}
	
	
	
	
	
	
	
	
	
	