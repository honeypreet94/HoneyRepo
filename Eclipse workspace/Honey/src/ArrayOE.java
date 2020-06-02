
public class ArrayOE {
	static int arr[]={1,3,6,4};
	public static void main(String arg[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			int flag=0;
			int j=0;
			int k=0;
			System.out.println("first");
			while(j!=arr.length)
			{
				System.out.println("first un");
				if(arr[i]%2==0)
				{
					System.out.println("first under");
					remove(arr[i]);
					flag++;
					break;
				}
			}
			System.out.println("second");
			while(k!=arr.length)
			{
				if(arr[i]%2!=0)
				{ 
					System.out.println("second iunder");
					remove(arr[i]);
					flag++;
					break;
				}
			}
			
		if(flag==0)
			break;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("sum is " +sum);
	}
	
	public static void remove(int element)
	{
		System.out.println("method");
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				for(int j=arr[i];j<arr.length;j++)
				{
					arr[i]=arr[i+1];
				}
				break;
			}
		}
	}

}
