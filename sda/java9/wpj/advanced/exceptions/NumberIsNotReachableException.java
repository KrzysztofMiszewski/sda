package sda.java9.wpj.advanced.exceptions;

public class NumberIsNotReachableException extends RuntimeException {
	
	
	private String OperatorName;
	
	public NumberIsNotReachableException() {
		super();
		
	}
	
	public NumberIsNotReachableException(String message) {
		super(message);
		
	}
	
	public NumberIsNotReachableException(String message, String OperatorName) {
		super(message);
		this.OperatorName = OperatorName;
	}

	public String OperatorName() {
		return this.OperatorName; 
	}
}