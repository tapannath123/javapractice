package com.capgemini.oops;

public class Computer {
		
		int id;
		String name;
		double price;
		long quantity;


	public Computer() {
		super();
		
	}

	public Computer(int id, String name, double price, long quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	
	
	public Computer(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	@Override				//CalltoString
	public String toString() {
		return "Computer [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}	
	
	
}
