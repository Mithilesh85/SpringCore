package com.mithilesh.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Jalebi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Jalebi [price=" + price + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("starting method");
		
	}
	@PreDestroy
	public void end()
	{
		System.out.println("ending method");
	}
	
}
