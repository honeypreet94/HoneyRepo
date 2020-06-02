package driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import main.SetterMain;

@Configuration
@ComponentScan("main")
public class Setter {

public static void main(String arg[])
{

/*Resource r=new ClassPathResource("xmls/SpringSetter.xml");
BeanFactory factory=new XmlBeanFactory(r);*/
//ApplicationContext ap=new ClassPathXmlApplicationContext("xmls/springSetter.xml");
ApplicationContext ap= new AnnotationConfigApplicationContext(Setter.class);
SetterMain t=(SetterMain)ap.getBean(SetterMain.class);
t.hello("Mani");
}
}

