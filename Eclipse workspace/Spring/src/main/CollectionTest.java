package main;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTest {
	
	private List fruits;
	private Set cricketers;
	private Map country;

	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public void setCountry(Map country) {
		this.country = country;
	}
	
	public List getFruits() {
		System.out.println("Fruits are: " + fruits );
		return fruits;
	}
	public Set getCricketers() {
		System.out.println("cricketers are: " + cricketers);
		return cricketers;
	}
	public Map getCountry() {
		System.out.println("Country are: " + country );
		return country;
	}


}
