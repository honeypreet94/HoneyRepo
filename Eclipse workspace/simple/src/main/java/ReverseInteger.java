public class ReverseInteger {

    public static void main(String arg[])
    {
        int x=222456;
        int rev=0;

        while(x!=0)
        {
            int r=x%10;
            x=x/10;
            if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE/10)
            {
                System.out.println("Overflow");
                break;
            }
            else if(rev<Integer.MIN_VALUE/10 || rev==Integer.MIN_VALUE/10)
            {
                System.out.println("Overflow");
                break;
            }
            else
            {
                rev=(rev*10 )+r;
            }



        }

        System.out.println(rev);
    }
}
