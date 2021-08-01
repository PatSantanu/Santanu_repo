package package1;

public class RemoveFirstLastFromArray {
	public static void main(String [] args)
	{
		int arr[]= {1,2,6,454,964,283,4564};
		for(int i=0;i<arr.length;i++)
		{
			if(isLastAndFirstDigitSame(arr[i])!=true)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	static boolean isLastAndFirstDigitSame(int a)
	{
		boolean b=false;
		String s=a+"";
		if(s.charAt(0)==s.charAt(s.length()-1))
		{
			b=true;
		}
		return b;
	}
}
