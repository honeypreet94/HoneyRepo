public class Prime100Divide5 {

    public static void main(String arg[])
    {
        //int n=100;
        int flag=1;
        System.out.print(2 +" ");
        for(int i=3;i<=100;i+=2)
        {
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                //System.out.print(Math.sqrt(i));
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag!=0)
                System.out.print(i + " ");

            flag=1;
        }


    }
}
