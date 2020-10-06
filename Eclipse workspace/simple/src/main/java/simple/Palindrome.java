package simple;

public class Palindrome {
	
	public static void main(String arg[])
	{
		int n=4546;
		int temp=n,r,sum=0;
		
		while(n!=0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum)
			System.out.println("Number is palindrome");
		else 
			System.out.println("Number is not palindrome");
	}

}
