package car;
import engine.*;

public class Car {
	
	private String carname;
	private Engine eng;
	
	public void setCarname(String carname)
	{
		this.carname=carname;
	}
	
	
	public Engine getEng() {
		return eng;
	}


	public void setEng(Engine eng) {
		this.eng = eng;
	}


	public void printCar()
	{
		System.out.println("Carname : " + carname);
		System.out.println("Model Year : " +  eng.getModelYear());
		
	}

}
