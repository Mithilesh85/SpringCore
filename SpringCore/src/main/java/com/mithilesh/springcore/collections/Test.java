package com.mithilesh.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

public static void main(String[] args) {
	
ApplicationContext context= new ClassPathXmlApplicationContext("collectionconfig.xml");
Employee emp=(Employee)context.getBean("employee");

System.out.println(emp.getEmpName());
System.out.println(emp.getEmpPhones());
System.out.println(emp.getEmpAddresses());
System.out.println(emp.getEmpCourses());
System.out.println(emp.getEmpProperties());
	
}
	
	
}
