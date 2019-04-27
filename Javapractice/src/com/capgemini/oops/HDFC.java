package com.capgemini.oops;

public class HDFC implements Bank{

	@Override
	public boolean deposit(double amount) {
		System.out.println("deposited amount"+amount);
		return true;
	}

	@Override
	public boolean withdraw(double amount) {
		System.out.println("withdrawal"+amount);
		return true;
	}

	@Override
	public double checkbalance() {
		// TODO Auto-generated method stub
		return 10000;
	}

	@Override
	public void sendsms() {
		// TODO Auto-generated method stub
		
	}

}
