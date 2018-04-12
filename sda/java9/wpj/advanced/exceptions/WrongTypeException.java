package sda.java9.wpj.advanced.exceptions;

class WrongTypeException extends RuntimeException {
	
	private String typeName;
	
	public WrongTypeException() {
		
		super();
		
	}
	
	public WrongTypeException(String msg) {
		
		super(msg);
		
	}
	
	public WrongTypeException(String msg, String typeName){
		
		super(msg);
		this.typeName = typeName;
		
	}
	
	public String getTypeName(){
		
		return this.typeName;
		
	}
	
}