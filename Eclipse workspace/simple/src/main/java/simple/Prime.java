package simple;

public class Prime {
	
	public static void main(String arg[])
	{
		int n=5,flag=0;
		if(n==0 || n==1)
		{
			System.out.println(" Number is not Prime");
			flag=1;
		}
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(" Number is not Prime");
				flag=1;
				break;
			}
				
		
		}
		
		if(flag==0)
		{
			System.out.println("Number is prime");
		}
		
	}

}
