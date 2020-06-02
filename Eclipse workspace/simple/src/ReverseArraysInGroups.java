public class ReverseArraysInGroups {
    public static void main(String arg[])
    {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int i=0,m=0,k=4,n=10;
        int j=i+k-1;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
            if(i>=j)
            {
                i=m+k;
                m=m+k;
                j=i+k-1;
            }
            if(j>n)
                j=n-1;
        }
        for(int l=0;l<n;l++)
        {
            System.out.println(a[l]);

        }
    }
}
