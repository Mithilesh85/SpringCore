package com.mithilesh.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycleconfig.xml");
//	registering shut down hook method for calling destroy method
	
	context.registerShutdownHook();
	
//	Samosa s=(Samosa)context.getBean("s1");
//	
//	
//	
//	Pepsi p=(Pepsi)context.getBean("p1");
//	System.out.println(s);
//	System.out.println(p);
//	

	Jalebi j=(Jalebi)context.getBean("j1");
	System.out.println(j);
		
	}
	
}
