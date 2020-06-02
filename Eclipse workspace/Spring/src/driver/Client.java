package driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import main.Test;

public class Client {
	
	public static void main(String args[])
	{
		Resource r =new ClassPathResource("xmls/spring.xml");
		BeanFactory factory= new XmlBeanFactory(r);
		
		Test t=(Test)factory.getBean("t");
		t.hello();
	}

}
