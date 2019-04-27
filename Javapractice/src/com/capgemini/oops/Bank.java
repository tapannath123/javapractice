package com.capgemini.oops;

public interface Bank {
	
	public abstract boolean deposit(double amount);
	public abstract boolean withdraw(double amount);
	public abstract double checkbalance();
	public abstract void sendsms();
	

}
