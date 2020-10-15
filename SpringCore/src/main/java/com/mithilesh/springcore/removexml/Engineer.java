package com.mithilesh.springcore.removexml;

import org.springframework.stereotype.Component;


public class Engineer {

	private GulabJamun gulabjamun;
	
	
	
public Engineer(GulabJamun gulabjamun) {
		super();
		this.gulabjamun = gulabjamun;
	}



public GulabJamun getGulabjamun() {
		return gulabjamun;
	}



	public void setGulabjamun(GulabJamun gulabjamun) {
		this.gulabjamun = gulabjamun;
	}



public void work()
{
	
  System.out.println("mithilesh is a software engineer who is working......");
}
}
