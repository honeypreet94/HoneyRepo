package simple;

public class FabonacciRecursion {
	
	static int n1=0,n2=1,n3=0;
	
	public static void main(String arg[])
	{
		int number=10;
		System.out.print(n1 + " " + n2 + " ");
		
		fab(number-2);
		
		
	}
	
	static void fab(int number)
	{
		if(number>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+ " ");
			fab(number-1);
		}
		
		
	}

}
