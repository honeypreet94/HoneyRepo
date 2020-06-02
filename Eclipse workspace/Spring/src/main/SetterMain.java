package main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class SetterMain {

	private String gender;
	
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public void hello(String name)
	{
		System.out.println("Hello" + gender + name);
	}

}
