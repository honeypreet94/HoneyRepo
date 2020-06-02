package main;

import java.util.HashMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionTest2 {
	
	private Vector fruits;
	private TreeSet cricketers;
	private HashMap country;
	public Vector getFruits() {
		System.out.println("Fruits : " + fruits);
		return fruits;
	}
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	public TreeSet getCricketers() {
		System.out.println("cricketers : " + cricketers);
		return cricketers;
	}
	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}
	public HashMap getCountry() {
		System.out.println("country : " + country);
		return country;
	}
	public void setCountry(HashMap country) {
		this.country = country;
	}

	

}
