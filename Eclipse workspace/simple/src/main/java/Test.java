public class Test {

    public static void main(String arg[])
    {
        print();

    }

    public static void print()
    {
        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
                System.out.print("FizzBuzz"  + " ");
            else if (i%3==0)
                System.out.print("Fizz"+ " ");
            else if (i%5==0)
                System.out.print("Buzz" + " ");
            else
                System.out.print(i + " ");
        }
    }


}
