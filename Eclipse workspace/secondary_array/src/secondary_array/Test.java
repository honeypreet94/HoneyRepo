package secondary_array;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	
	public static void main(String a[])
	{
	
		ApplicationContext ac=new ClassPathXmlApplicationContext("one.xml");
		Car ca=(Car)ac.getBean("c");
		//ca.print();
		
		
	}
}
