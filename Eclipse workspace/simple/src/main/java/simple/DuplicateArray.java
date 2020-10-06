package simple;

import java.util.Arrays;

public class DuplicateArray {
	
	public static void main(String arg[])
	{
		int arr[]= {11,56,45,38,90,25,11,45,90,38,11,11};
		Arrays.sort(arr);
		int n=arr.length;
		int i=0;
		while(i<n-1)
		{
			int count=1;
			if(arr[i]==arr[i+1])
			{
				int j=arr[i];
				while(i<n-1 && j==arr[i+1] )
				{
					count++;
					i++;
				}
				System.out.println(j +"is" + count + " times");
			}
			else
			{
				i++;
				continue;
			}
		}
	}

}
