package driver;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.Array;

public class ArrayMain {
	
	public static void main(String arg[])
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("xmls/array.xml");
		Array a=(Array)context.getBean("t");
		
		a.print();
	}

}
