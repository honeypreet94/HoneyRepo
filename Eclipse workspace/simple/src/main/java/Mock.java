public class Mock {

    public static void main(String arg[])
    {
        int arr[]={3,6,1,7,3};
        int large=arr[0];
        int second=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                second=large;
                large=arr[i];
            }
        }
    }

}
