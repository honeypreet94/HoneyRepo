package com.online.banking.onlinebanking.beans;

public class PanBean {
	String pan;
	double creditScore;

	/*public PanBean(String pan,double creditScore)
	{
		this.pan=pan;
		this.creditScore=creditScore;
	}*/
	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public double getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(double creditScore) {
		this.creditScore = creditScore;
	}
	
	
	@Override
	public String toString() {
		return "PanBean [pan=" + pan + ", creditSore=" + creditScore + "]";
	}

}
