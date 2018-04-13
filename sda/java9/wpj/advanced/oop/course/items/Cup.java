package sda.java9.wpj.advanced.oop.course.items;

public class Cup {
 private boolean empty;
 private String content;
 private String clean;
 private String reserved;

	public Cup(){
		empty = true;
	}
	
public boolean getEmpty() {
return empty;
}
public String getContent() {
return content;
}
public String getClean() {
return clean; 
}
public String getReserved() {
return reserved;
}
public  void setEmpty(String isEmpty) {
	this.empty = empty;
}
public  void setContent(String content) {
	this.content = content;
}
public void setClean(String isClean) {
	this.clean = clean;
}
public void setReserved(String isReserved) {
	this.reserved = reserved;
}
}