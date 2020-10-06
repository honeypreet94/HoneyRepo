import java.util.Arrays;

public class MinimumPlatform {
    public static void main(String arg[])
    {
        int a[]={900,1100,1235};
        int n=a.length;
        int d[]={1000,1200,1240};
        int total=0,free=0;
        Arrays.sort(d);
        int j=0;
        for(int i=0;i<n;i++)
        {

            if(a[i]>d[j])
            {
                for(;a[i]>d[j];j++)
                {
                    free++;
                }
                if(free>0)
                    free--;
                else
                    total++;

            }
            else
            {
                if(free>0)
                    free--;
                else
                    total++;
            }
        }

        System.out.println(total);
    }
}
