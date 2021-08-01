package package1;
import java.util.Scanner;


public class AreaOfQadilateral {
	static double areaOfQuadilateral(double l, double b)
	{
		return l*b;
	}
	static double areaOfQuadilateral(double s)
	{
		return s*s;
	}
	static double areaOfQuadilateral(double a,double b,double h )
	{
		return(a+b)* h/2;
	}
	
	public static void main(String[] args)
	{
		System.out.println(" R for Rectangle\n S for Sqaure\n T for Trapezium\n Enter the value:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.equalsIgnoreCase("R"))
		{
			System.out.println("length of rectangle");
			double l=sc.nextDouble();
			System.out.println("Breadth of rectangle");
			double b=sc.nextDouble();
			System.out.println("Area of rectangle is:");
			System.out.println(areaOfQuadilateral(l,b));
		}
		if(s.equalsIgnoreCase("S"))
		{
			System.out.println("Side of Square");
			double l=sc.nextDouble();
			System.out.println("Area of square is:");
			System.out.println(areaOfQuadilateral(l));
		}
		if(s.equalsIgnoreCase("T"))
		{
			System.out.println("length of one parallel side");
			double l=sc.nextDouble();
			System.out.println("length of another parallel side");
			double b=sc.nextDouble();
			System.out.println("Height of trapezium");
			double h=sc.nextDouble();
			System.out.println("Area of trapezium is:");
			System.out.println(areaOfQuadilateral(l,b,h));
		}
		sc.close();
		
	}
}


