public class MultithreadingVolatile {

    static int x=5;

    public static void main(String arg[])
    {
        MyThread2 obj=new MyThread2();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        //new MyThread2().start();
        obj.start();
    }

}


class MyThread extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread());
        MultithreadingVolatile.x++;
    }
}

class MyThread2 extends Thread{

    public void run()
    {
        System.out.println(Thread.currentThread());
        System.out.println(MultithreadingVolatile.x);

    }
}

