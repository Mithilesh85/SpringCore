package com.mithilesh.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String empName;
	private List<String> empPhones;
	private Set<String> empAddresses;
	private Map<String,String> empCourses;
	private Properties empProperties;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpPhones() {
		return empPhones;
	}
	public void setEmpPhones(List<String> empPhones) {
		this.empPhones = empPhones;
	}
	public Set<String> getEmpAddresses() {
		return empAddresses;
	}
	public void setEmpAddresses(Set<String> empAddresses) {
		this.empAddresses = empAddresses;
	}
	public Map<String, String> getEmpCourses() {
		return empCourses;
	}
	public void setEmpCourses(Map<String, String> empCourses) {
		this.empCourses = empCourses;
	}
	
	
	public Properties getEmpProperties() {
		return empProperties;
	}
	public void setEmpProperties(Properties empProperties) {
		this.empProperties = empProperties;
	}
	
	
	public Employee(String empName, List<String> empPhones, Set<String> empAddresses, Map<String, String> empCourses,Properties empProperties) {
		super();
		this.empName = empName;
		this.empPhones = empPhones;
		this.empAddresses = empAddresses;
		this.empCourses = empCourses;
		this.empProperties=empProperties;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
