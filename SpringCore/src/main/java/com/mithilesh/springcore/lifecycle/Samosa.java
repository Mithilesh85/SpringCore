package com.mithilesh.springcore.lifecycle;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		
		System.out.println("price is set");
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void start()
	{
		System.out.println("inside init method");
		
	}
	public void end()
	{
		System.out.println("inside destroy method");
	}
	
}
