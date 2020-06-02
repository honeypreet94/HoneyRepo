package main;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowiringCar {
	private AutowiringEngine engine;
	private String carName;
	public void setCarName(String carName)
	{	
		this.carName=carName;
	}
	@Autowired
	public void setEngine(AutowiringEngine engine) {
		this.engine = engine;
	}
	public void printCarData()
	{
		System.out.println("Car Name : " + carName);
		System.out.println("Model Year" + engine.getModelYear());
	}

}
