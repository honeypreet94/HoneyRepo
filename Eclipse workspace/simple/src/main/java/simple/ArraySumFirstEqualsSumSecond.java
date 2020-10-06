package simple;

public class ArraySumFirstEqualsSumSecond {
	
	public static void main(String arg[])
	{
		int arr[]= {2,5,1,1,5,9};
		int sumFirst=0;
		
		for(int i=1;i<arr.length;i++)
		{
			int prevElement= arr[i-1];
			sumFirst=sumFirst+prevElement;
			int sumLast=0;
			for(int j=i+1;j<arr.length;j++)
			{
				sumLast=sumLast+arr[j];
			}
			System.out.println("sumFirst =" + sumFirst);
			System.out.println("sumLast =" + sumLast);
			if(sumLast==sumFirst)
			{
				System.out.println("Element is " + arr[i]);
				System.out.println("index is " + i);
				break;
			}
			
		}
	}

}
