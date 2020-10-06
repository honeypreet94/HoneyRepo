package simple;

public class StringFirstLast {
	
	public static void main(String arg[])
	{
		String str="My name is Honey";
		int length=str.length();
		char first=str.charAt(0);
		char last=str.charAt(length-1);
		System.out.println(last+str.substring(1,length-1)+first);
	}

}
