package com.mithilesh.springcore.removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mithilesh.springcore.removexml.*;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
	
	Engineer e=context.getBean("getEngineer",Engineer.class);
	
	System.out.println(e);
	
	e.work();
	
	GulabJamun g=context.getBean("getGulabjamun",GulabJamun.class);
	g.display();
	}

}
