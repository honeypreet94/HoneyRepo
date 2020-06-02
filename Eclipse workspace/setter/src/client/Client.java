package client;

import beans.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String a[])
	{
		Resource r=new ClassPathResource("resource/spring.xml");
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
	    BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
	    reader.loadBeanDefinitions(r);
		
		Test t=(Test)beanFactory.getBean("t");
		t.hello();
	}

}