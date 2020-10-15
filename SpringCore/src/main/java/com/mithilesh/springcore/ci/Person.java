package com.mithilesh.springcore.ci;

import java.util.List;

public class Person {

	private String pName;
	private int pId;
	private Certi  certi;
	private List list;
	
	public  Person(String pName,int pId,Certi certi,List<String> list)
	{
		this.pName= pName;
		this.pId=pId;
		this.certi=certi;
		this.list=list;
		
	}

	@Override
	public String toString() {
		
		return this.pName+" : "+this.pId+"  {"+this.certi.name+"}"
		+"  "+this.list;
		
	}
	
	
}
