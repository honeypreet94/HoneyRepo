public class MultiThreadingSynchronize {
    public static void main(String arg[])
    {
        Display d=new Display();
        new My(d,"P1").start();
        new My(d,"P2").start();
        new My(d,"P3").start();
    }
}

class Display
{
     synchronized void wish(String n)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread());
            try {
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }


    }
}

class My extends Thread
{
    Display d;
    String n;
    My(Display x,String y)
    {
        d=x;
        n=y;
    }
    public void run()
    {
        d.wish(n);
    }
}
