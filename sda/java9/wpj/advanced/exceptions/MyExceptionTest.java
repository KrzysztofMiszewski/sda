package sda.java9.wpj.advanced.exceptions;

public class MyExceptionTest{
	
	public void main(String[] args){
		MyExceptionTest myObject = new MyExceptionTest();
		try{
		myObject.firstTestException();
		myObject.secoundTestException();
		} catch (WrongIndexException exception) {
			System.err.println("Wystapil wyjatek! Wiadomosc: " + exception.getMessage());
		} catch (ServiceNotAvailableException exception) {
			System.err.println("Wystapil wyjatek! Wiadomosc: " + exception.getMessage());
		}
	}
	
	public void firstTestException() throws WrongIndexException{
		throw new WrongIndexException();
	}
	
	public void secoundTestException() throws ServiceNotAvailableException{
		throw new ServiceNotAvailableException();
	}
}