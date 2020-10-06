public class RemoveDuplicatesSortedArray {

    public static void main(String arg[])
    {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        int n=arr.length;
        int j=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
            }
        }

        for(int i=0;i<j+1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
