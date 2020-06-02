package simple;

public class LeftSmallRightGreater {
    public static void main(String arg[])
    {
        int arr[]={4,2,5,7};
        int n=arr.length;
        int output=-1;
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]<arr[i+1] && arr[i]>arr[i-1])
                output=arr[i];
        }
        System.out.println(output);
    }
}
