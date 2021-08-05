package validation;

public class InvalidAdhaar extends RuntimeException{
    public InvalidAdhaar () {
        super();
        
    }
    public InvalidAdhaar (String message) {
        super(message);
        
    } 
	

}
