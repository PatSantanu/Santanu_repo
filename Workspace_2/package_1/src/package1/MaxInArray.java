package package1;
import java.util.Arrays;
//import java.util.Scanner;

public class MaxInArray {
	
	public static int nthLargest(Integer[] arr,
            int n)
	{
		Arrays.sort(arr);

		return arr[n - 1];
	}
	
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int n= 3;  
        System.out.print("n'th Largest element is " + nthLargest(arr, n));
	}

}
