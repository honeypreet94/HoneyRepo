package driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import main.ConstructorMain;

public class Constructor {

	public static void main(String arg[])
	{
		
		Resource r=new ClassPathResource("xmls/springConst.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		ConstructorMain t=(ConstructorMain)factory.getBean("t");
		t.hello();
	}
}
