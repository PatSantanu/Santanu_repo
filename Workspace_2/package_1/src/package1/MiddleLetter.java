package package1;
import java.util.Scanner;

public class MiddleLetter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(convertMiddle(s));
        
	}
	static String convertMiddle(String s) {
		if(s.length()%2==0)
		{
			char a=s.charAt(0);
			return Character.toUpperCase(a)+s.substring(1,s.length());
		}
		else
		{
			int z=s.length()/2;
			char b=s.charAt(z);
			char c=Character.toUpperCase(b);
			return s.substring(0,s.length()/2)+c+s.substring(z+1);
		}
		
		
	}

}

