package beans;

public class Test {

	/* private String gender;
	
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	public void hello(String name)
	{
		System.out.println("Hello..." + gender + name);
	}
	*/
	
	private String name;
	private int age;
	
	/*public Test(String name)
	{
		this.name=name;
	}
	public Test(int age)
	{
		this.age=age;
	}
	
	*/
	
	public Test(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void hello()
	{
		System.out.println("name: " + name + "age :" + age);
	}
	
	
	
	
}
