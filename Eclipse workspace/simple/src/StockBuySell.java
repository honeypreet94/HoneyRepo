public class StockBuySell {
    public static void main(String arg[])
    {
        int a[]={23,13,25,29,33,19,34,45,65,67};
        int n=a.length;
        int flag=0;

        for(int i=0;i<n-1;i++)
        {

            if(flag==0 && a[i]<a[i+1])
            {
                System.out.print(a[i]+ ",");
                flag=1;
            }
            else if(flag==1 && a[i]>a[i+1])
            {
                System.out.print(a[i]);
                System.out.println();
                flag=0;
            }
            else if((i+1)==n-1)
            {
                System.out.print(a[i+1]);
                System.out.println();
                flag=0;
            }
        }
    }
}
