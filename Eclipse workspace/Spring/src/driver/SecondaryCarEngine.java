package driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import main.Car;

public class SecondaryCarEngine {
	
	public static void main(String arg[])
	{
		Resource r=new ClassPathResource("xmls/car.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Car c=(Car)factory.getBean("t");
		
		c.printCarData();
		
	}

}
