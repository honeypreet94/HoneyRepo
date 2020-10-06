package simple;

public class StringPalindrome {
	
	public static void main(String arg[])
	{
		String str="aabbaaa";
		String rev="";
		int length=str.length();
		for(int i=length-1;i>=0;i--)
			
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindorme");
	}

}
