package sda.java9.wpj.advanced.oop.course.people;

import sda.java9.wpj.advanced.oop.course.rooms.*;
import sda.java9.wpj.advanced.oop.course.content.*;

public class CourseManager {
	
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
    private ClassRoom classRoom;
    
    public String sayGreetings() {
        String greet = "Witajcie na kursie Java";
        greet += "\nNazywam sie " + this.firstName + " " + this.lastName;
        greet += "\nJestem opiekunem tego kursu i w razie wszelkich pytan jestem";
        greet += " do Waszej dyspozycji. Nie mowie polskimi znakami, bo wiem, ze sa z tym problemy...";
        greet += "\nJezeli potrzebowalibyscie kontaktu do mnie, to oto moja wizytowka:\n\n";
        String businessCard = getBusinessCard();
        greet += businessCard;
        return greet;
    }
    
    public String getBusinessCard() {
        String title = "Mr. " + this.firstName + " " + this.lastName;
        String phone = "Tel:   " + this.phoneNumber;
        String email = "Email: " + this.email;
        
        int longestData = (int) Math.max(title.length(), Math.max(phone.length(), email.length()));
        
        String header = "--" + signLine(longestData, '-') + "--";
        String footer = "--" + signLine(longestData, '-') + "--";
        String breakLine = "| " + signLine(longestData, ' ') + " |";
        
        title = "| " + title + signLine(longestData - title.length(), ' ') + " |";
        phone = "| " + phone + signLine(longestData - phone.length(), ' ') + " |";
        email = "| " + email + signLine(longestData - email.length(), ' ') + " |";
        
        return (header.concat("\n").concat(title).concat("\n")
                    .concat(breakLine).concat("\n").concat(phone).concat("\n")
                    .concat(email).concat("\n").concat(footer));
    }
    
    private String signLine(int length, char sign) {
        char[] chars = new char[length];
        java.util.Arrays.fill(chars, sign);
        return new String(chars);
    }
    
    public void openRoom(ClassRoom room) {
        room.setIsOpen(true);
    }
    
    public void enterRoom(ClassRoom room) {
        if (!room.getIsOpen()) {
            if (room.getCourseManager() != null) {
                throw new IllegalStateException("Menedzer juz jest w pokoju!");
            }
            this.openRoom(room);
        }
        this.classRoom = room;
        room.setCourseManager(this);
    }
    
    public String sayCourseInfo(Course course) {
        return "Witacie, to jest kurs " + course.getTitle() + ". Co mogę powiedzieć o kursie? " + course.getShortDescription();
    }
    
    public ClassRoom getRoom() {
        return classRoom;
    }
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    public void setPhoneNumber(String email) {
		this.phoneNumber = phoneNumber;
	}
}