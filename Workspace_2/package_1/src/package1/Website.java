package package1;

public class Website {

	static String issecure(String str)
	{
		if(str.startsWith("https://"))
			{return "secure";}
		else
		if(str.startsWith("http://"))
		{return "not secure";}
		
		return "not secure";
		
	}
	public static void main(String[] args) 
	{
		System.out.println(issecure("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(issecure("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(issecure("helloworld.com/wiki/Main_Page"));
		System.out.println(issecure("hacker.challenge.org/wiki/Main_Page"));
		
	}
}
