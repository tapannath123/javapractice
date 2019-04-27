package com.capgemini.oops;


	public class Child extends Parent{
	private String car;

	public Child() {
	super(); //it calls parent constructor
	//here child object created...
	}

	public Child(String house, int land, String car) {
	super(house, land); //it call parent constructor with 2 parameter
	this.car = car;
	}
	public String getCar() {
	return car;
	}
	public void setCar(String car) {
	this.car = car;
	}
	//adding new facility 
	public String readMagazine() {
	return "Magazine";
	}
	@Override
	public String toString() {
	return "Child [car=" + car + ", getHouse()=" + getHouse() + ", getLand()=" + getLand() + ", toString()="
	+ super.toString() + ", readingPaper()=" + readingPaper() + ", getClass()=" + getClass()
	+ ", hashCode()=" + hashCode() + "]";
	} 
	public void fun() {
	System.out.println("Mobile: "+ mobile);
	}
	@Override
	public String readingPaper() { 
	return "English";
	}

	} 

