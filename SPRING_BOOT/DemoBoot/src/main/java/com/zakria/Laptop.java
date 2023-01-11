package com.zakria;

import org.springframework.stereotype.Component;

@Component("lap1")  //  i have written this so that it identifies inside spring container and which is used in laptop class
public class Laptop
{
	private int lid;
	private String brand;
	
	
	@Override        //TOstringMethod
	public String toString() {
		return "laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public void compile()
	{
		System.out.println("It is Compiling");
	}

}
