package validation;

public class BussinessLayer {
	public boolean isValidAdhaar(String Adhaar) throws InvalidAdhaar {
        if(Adhaar!=null && Adhaar.matches("[0-9]{12}")) {
            return true;
        }else {
            throw new InvalidAdhaar ("Entered Adhaar "+Adhaar+" is INVALID");
        }
    }

}
