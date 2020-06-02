package threading;
import threading.Threading;

public class ThreadingDemo {
	public static void main(String arg[])
	{
		int n=8;
		for(int i=0;i<n;i++)
		{
			Threading thread=new Threading();
			thread.start();
		}
	}

}
