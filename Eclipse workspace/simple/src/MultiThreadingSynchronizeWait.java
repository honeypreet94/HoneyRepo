public class MultiThreadingSynchronizeWait {
    public static void main(String arg[])
    {
        Data d=new Data();
        new Producer(d).start();
        new Consumer(d).start();
    }
}


class Data
{
    int x;
    public void increment()
    {
        x++;
    }
    public void decrement()
    {
        x--;
    }
}

class Producer extends Thread
{
    Data d;
    Producer(Data d)
    {
        this.d=d;
    }
    public void run() {
        synchronized (d) {
            for(int i=0;i<5;i++)
            {
                if (d.x < 3) {
                    d.increment();
                    System.out.println("produced" + d.x);
                }
                try {
                    d.notifyAll();
                } catch (Exception e) {

                }


                if (d.x == 3) {
                    try {
                        d.wait();
                    } catch (Exception e) {

                    }

                }
            }

        }
    }
}

class Consumer extends Thread {
    Data d;

    Consumer(Data d) {
        this.d=d;
    }

    public void run() {
        synchronized (d) {
            for(int i=0;i<5;i++)
            {
                if(d.x>0)
                {
                    d.decrement();
                    System.out.println("Consumed" + d.x);
                }
                try {
                    d.notifyAll();
                } catch (Exception e) {

                }
                if(d.x==0)
                {
                    try{
                        d.wait();
                    }
                    catch (Exception e)
                    {

                    }

                }
            }


        }
    }
}
