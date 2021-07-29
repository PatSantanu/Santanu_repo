package package1;
import java.lang.Math;
public class TriangleHypotenuse {
	static double hypotenuse(double a,double b)
	{
		double c=(float)Math.pow((a*a+b*b), 0.5);
		return c;
	}

	public static void main(String[] args) {
		
		System.out.println((int)hypotenuse(3,4));
		System.out.println(hypotenuse(34.5,23.6));

	}
}
