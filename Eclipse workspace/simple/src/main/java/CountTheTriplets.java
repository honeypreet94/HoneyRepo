import java.util.HashMap;
public class CountTheTriplets {
    public static void main(String arg[])
    {
        int arr[]={1,5,3,2};
        int n=arr.length;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],arr[i]);
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum= arr[i]+arr[j];
                if(map.containsKey(sum))
                    count++;
            }
        }
        System.out.println(count);
    }
}
