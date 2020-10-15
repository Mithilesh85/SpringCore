package com.mithilesh.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("object")
@Scope("prototype")
public class Student {

	@Value("mithilesh")
	private String sName;
	@Value("singrauli")
	private String city;
	
	@Value("#{address}")
	private List<String>address;
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", city=" + city + ", address=" + address + "]";
	}
	
	
	
}
