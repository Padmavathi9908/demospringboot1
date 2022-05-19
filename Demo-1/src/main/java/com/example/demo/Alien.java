package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Alien {

	private int aid;
	private String aname;
	private String tech;
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;

	public Alien() {
		super();
		System.out.println("object created");

	}

	/**
	 * @return the aid
	 */
	public int getAid() {
		return aid;
	}

	/**
	 * @param aid the aid to set
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}

	/**
	 * @return the aname
	 */
	public String getAname() {
		return aname;
	}

	/**
	 * @param aname the aname to set
	 */
	public void setAname(String aname) {
		this.aname = aname;
	}

	/**
	 * @return the tech
	 */
	public String getTech() {
		return tech;
	}

	/**
	 * @param tech the tech to set
	 */
	public void setTech(String tech) {
		this.tech = tech;
	}

	/**
	 * @return the laptop
	 */
	public Laptop getLaptop() {
		return laptop;
	}

	/**
	 * @param laptop the laptop to set
	 */
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void show() {
		System.out.println("in show");
		laptop.compile();
	}
}
