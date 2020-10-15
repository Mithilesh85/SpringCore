package com.mithilesh.springcore.removexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {

	@Bean
	public GulabJamun getGulabjamun()
	{
		
		
		return new GulabJamun();
	}
	
	@Bean
	public Engineer getEngineer()
	{
		
		Engineer e=new Engineer(getGulabjamun());		
		
		return e;
	}
	
	
}
