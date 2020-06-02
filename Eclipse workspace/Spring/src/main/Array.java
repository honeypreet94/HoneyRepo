package main;

public class Array {
	
	private String name[];

	public void setName(String[] name) {
		this.name = name;
	}
	
	public void print()
	{
		System.out.println("Car name =");
		for(String names:name)
			System.out.println(names);
	}

}
