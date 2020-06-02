package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.CollectionTest2;

public class CollectionMain2 {
	
	public static void main(String arg[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("xmls/collection2.xml");
		CollectionTest2 test=(CollectionTest2)context.getBean("t");
		test.getFruits();
		test.getCricketers();
		test.getCountry();
		
	}

}
