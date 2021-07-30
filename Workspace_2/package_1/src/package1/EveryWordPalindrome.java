package package1;

public class EveryWordPalindrome {

public static void main(String[] args) {
		
		String s="Hi good morning mom";
		System.out.println(rev(s));
	}
	
	public static String rev(String s) {
		String ar[]=s.split(" ");
		StringBuilder st=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			if(ar[w].equalsIgnoreCase(new StringBuilder(ar[w]).reverse().toString())) {
				st.append(new StringBuilder(ar[w])).append(" ");
			}
			else {
			
			st.append( new StringBuilder(ar[w]).reverse().toString()).append(" ");}
		}
		return st.toString().trim();
	}
}