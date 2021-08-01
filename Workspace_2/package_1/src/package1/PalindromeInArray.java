package package1;

import java.util.Scanner;

public class PalindromeInArray {
	
		public static void main(String[] args) {
			int arr[]= {1,2,2,33,4554,345543,67,78};
			pallindrome(arr);

		}
		 static boolean isPallindrome(String s)
		 {
			 StringBuilder sb= new StringBuilder(s);
			 sb.reverse();
			 String s1=sb.toString();
			 return s1.equals(s);
		 }
		 static void pallindrome(int arr[])
		 {
			 for(int i=0;i<arr.length;i++)
			 {
				 
				 if(isPallindrome(arr[i]+""))
				 {
					 System.out.print(arr[i]+" ");
				 }
			 }
		 }
}