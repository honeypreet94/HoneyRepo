public class Mock2 {

    public static void main(String arg[])
    {
        //System.out.print(Mock2.method());
        System.out.print(Mock2.formatEquation(10));
    }

    public static String method()
    {
        String str="";
        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
                str=str+"FizzBuzz ";
            else if(i%3==0)
                str=str+"Fizz ";
            else if(i%5==0)
                str=str+"Buzz ";
            else
                str=str+i+" ";
        }

        return str;
    }

    public static String formatEquation(int n)
    {
        int sum=0;
        String str="";
        for(int i=1;i<n;i++)
        {
            if(i%3==0 || i%5==0)
            {
                str=str+i;
                sum=sum+i;
                if((i+1)<n)
                    str=str+"+";
            }
        }
        str=str+"="+sum;
        return str;
    }
}


