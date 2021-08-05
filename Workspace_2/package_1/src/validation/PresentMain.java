package validation;

public class PresentMain {
	public static void main(String[] args) {
        BussinessLayer b1=new BussinessLayer();
        try {
        if(b1.isValidAdhaar("1234567890189")) {
            System.out.println("Adhaar Validated");
        }
        }catch(InvalidAdhaar  e){
            System.out.println(e.getMessage());
        }
    }

}
