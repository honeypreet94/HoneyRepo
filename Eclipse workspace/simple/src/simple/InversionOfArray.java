package simple;

public class InversionOfArray {
    public static void main(String arg[])
    {
        int arr[]={8,4,2,1};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int small=arr[i];
            for(int j=i+1;j<n;j++)
            {
                if(small>arr[j])
                    count++;
            }

        }
        System.out.println(count);

    }
}
