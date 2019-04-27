package com.capgemini.oops;

public class Demo {
	

	public static void main(String[] args) {
		
	System.out.println("Inheritance demo..."); 

	Child child = new Child("xyz house" ,12, "BMW");
	System.out.println(child);
	System.out.println(child.readingPaper()); //english
	System.out.println(child.readMagazine());
	
	child.fun();
	
	}
	
}



