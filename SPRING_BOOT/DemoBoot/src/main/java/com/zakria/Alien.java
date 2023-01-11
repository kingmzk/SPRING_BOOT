package com.zakria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component               // it will help to identify object inside Spring Container	 
//@Scope(value="prototype")   // this help us to create multiple istance or else it will create once
public class Alien
{
	public Alien() {
		super();
		System.out.println("Object is Created");
	}

	private int aid;
	private String name;
	private String tech;
	
	@Autowired      //it is used because it is dependent on laptop class so by autowired it identifies. It tries to Connect
	@Qualifier("lap1")       //here By default its name is laptop . To change it lap1 we use this
	private Laptop laptop;
	
	

	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}

	public void show()
	{
		System.out.println("OH it is Working");
		laptop.compile();
	}
	
}
