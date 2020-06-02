package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.SecondaryCar;

public class SecondaryArrayMain {
	
	public static void main(String arg[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("xmls/secondaryCar.xml");
		SecondaryCar c=(SecondaryCar)context.getBean("t");
		c.getEngine();
	}

}
