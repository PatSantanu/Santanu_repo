package package1;

public class HighestNumberedLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="Hello hi how are you doing";
		System.out.println(printHighestWord(S));
	}
	public static String printHighestWord(String input)
	{
		String arr=" ";
		String[] words= input.split(" ");
		int length=0;
		for(int i=0; i<words.length;i++) {
			if(words[i].length()>length)length=words[i].length();
				
			}
		for(int i=0; i<words.length;i++) {
			if(words[i].length()==length)arr+=words[i]+""; 
		}
		
		return arr;
	}

}
