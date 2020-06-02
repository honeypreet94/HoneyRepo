package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import main.CollectionTest;

public class CollectionMain {
	
	public static void main(String arg[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("xmls/collection.xml");
		CollectionTest test=(CollectionTest)context.getBean("t");
		test.getFruits();
		test.getCricketers();
		test.getCountry();
	}

}
