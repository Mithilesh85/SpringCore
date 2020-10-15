package com.mithilesh.springcore.standalone.collectons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mithilesh.springcore.standalone.collectons.*;;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("standaloneconfig.xml");
		Person p=context.getBean("person",Person.class);
		
		System.out.println(p.getFriends());
		System.out.println(p.getFriends().getClass().getName());
		System.out.println("---------------------------");
		System.out.println(p.getFeestructure().getClass().getName());
		System.out.println(p.getFeestructure());
		System.out.println("---------------------------");
		System.out.println(p.getProperties().getClass().getName());
		System.out.println(p.getProperties());
		
		
	}

}
