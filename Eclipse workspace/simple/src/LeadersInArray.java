public class LeadersInArray {

    public static void main(String arg[])
    {
        int arr[]={7,4,5,7,3};
        int n=arr.length;
        int large=0;
        for(int i=n-1;i>=0;i--)
        {
            if(i==n-1)
            {
                large=arr[i];
                System.out.print(large + " ");
            }
            else if(large<=arr[i])
            {
                large=arr[i];
                System.out.print(large +" ");
            }
        }
    }
}
