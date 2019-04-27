package com.capgemini.demo;

import com.capgemini.oops.Computer;

public class MyComputer {

	public static void main(String[] args) {


		System.out.println("Computerdemo");
		Computer dell= new Computer(101,"Dell",30000,100);
		
		System.out.println("Computer details" + dell);			//call toString()

		
		dell.setPrice(40000);
		dell.setId(500);
		dell.setName("HP");
		dell.setQuantity(150);
		System.out.println("Modified Computer details" + dell);
		
		
		System.out.println("want to know price:" + dell.getPrice());
		
		//Create lenovo computer
		
		Computer lenovo= new Computer();
		
		//got computer details
		
		
		System.out.println("before"+lenovo);
		
		lenovo.setId(1000);
		lenovo.setName("lenovo computer");
		lenovo.setPrice(38000);
		lenovo.setQuantity(12);
		
		System.out.println("after:"+lenovo);
		
	}

}
