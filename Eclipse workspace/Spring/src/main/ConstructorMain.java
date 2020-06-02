package main;

public class ConstructorMain {

	private String name;
	private int age;
	ConstructorMain(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void hello()
	{
		System.out.println("name" + name + "age"+ age);
	}
}
