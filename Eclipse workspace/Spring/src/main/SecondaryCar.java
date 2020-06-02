package main;

public class SecondaryCar {

	private SecondaryEngine[] engine;

	public SecondaryEngine[] getEngine() {
		for(SecondaryEngine engines:engine)
			System.out.println(engines.getModelYear());
		return engine;
	}

	public void setEngine(SecondaryEngine[] engine) {
		this.engine = engine;
	}
	
	
	
}
