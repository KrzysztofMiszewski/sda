package sda.java9.wpj.advanced.exceptions;

public class ServiceNotAvailableException extends Exception {
    
    private String serviceName;
    
    public ServiceNotAvailableException() {
        super();
    }
    
    public ServiceNotAvailableException(String message) {
        super(message);
    }
    
    public ServiceNotAvailableException(String message, String serviceName) {
        super(message);
        this.serviceName = serviceName;
    }
    
    public String getServiceName() {
        return this.serviceName;
    }
    
}
