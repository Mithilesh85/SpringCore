package com.mithilesh.springcore.references;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mithilesh.springcore.references.*;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("referenceconfig.xml");
		A a=(A)context.getBean("aref");
		
		System.out.println(a.getX());
		System.out.println(a.getB().getY());
		System.out.println(a);
		
	}
	
}
