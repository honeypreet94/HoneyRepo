package client;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import client.Client;
import engine.Engine;
import car.Car;

public class Client {
	
	public static void main(String a[])
	{
		String files[]= {"resource/car.xml","resource/engine.xml"};
		ApplicationContext ac=new ClassPathXmlApplicationContext(files);
		Car ca=(Car)ac.getBean("c");
		ca.printCar();
		
		
	}

}
