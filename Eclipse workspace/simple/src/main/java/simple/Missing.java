package simple;

public class Missing {
	
	public static void main(String arg[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,10};
		int sum=0,ans=55;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
			
		
		System.out.println(sum + " " + arr.length);
		System.out.println("missing number is " + (ans-sum));
		
		
		
		
	}

}
