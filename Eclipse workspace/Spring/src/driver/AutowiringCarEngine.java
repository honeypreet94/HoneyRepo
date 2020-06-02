package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.AutowiringCar;

public class AutowiringCarEngine {
	public static void main(String arg[])
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("xmls/AutowiringCar.xml");
	AutowiringCar c=(AutowiringCar)context.getBean("t");
	c.printCarData();
	}
}
