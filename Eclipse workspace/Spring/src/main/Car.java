package main;

public class Car {
	
	private Engine engine;
	private String carName;
	public void setCarName(String carName)
	{	
		this.carName=carName;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void printCarData()
	{
		System.out.println("Car Name : " + carName);
		System.out.println("Model Year" + engine.getModelYear());
	}
}
