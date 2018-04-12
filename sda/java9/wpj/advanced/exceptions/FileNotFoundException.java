package sda.java9.wpj.advanced.exceptions;

class FileNotFoundException extends Exception{
	
	private String path;
	
	public FileNotFoundException(){
		super();
	}
	
	public FileNotFoundException(String msg){
		super(msg);
	}
	
	public FileNotFoundException(String msg, String path){
		super(msg);
		this.path = path;
	}
	
	public String getPath(){
		return this.path;
	}
}