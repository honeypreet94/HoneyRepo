public class TrappingRainWater {
    public static void main(String arg[])
    {
        int a[]={6,9,9};
        int n=a.length;
        int l=0,sum=0;
        if(a[0]<a[n-1])
            l=a[0];
        else
            l=a[n-1];

        for(int i=1;i<n-1;i++)
        {
            if(a[i]<l)
            {
                sum=sum+(l-a[i]);
            }
        }
        System.out.println(sum);
    }
}
