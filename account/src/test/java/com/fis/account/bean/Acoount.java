package com.fis.account.bean;

public class Acoount {
	
	private long number;
	String type;
	double balance;
	
	
	
	
	
	public Acoount(long number, String type, double balance) {
		super();
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
	
	
	
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Acoount [number=" + number + ", type=" + type + ", balance=" + balance + "]";
	}

	
	

}