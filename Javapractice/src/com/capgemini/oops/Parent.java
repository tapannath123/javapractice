package com.capgemini.oops;

	
	abstract public class Parent {
		private String house;
		private int land;


		protected String mobile ="823423";

		public Parent() {
		System.out.println("parent constructor (empty)");
		}
		public Parent(String house, int land) {
		System.out.println("parent constructor (with para)");
		this.house = house;
		this.land = land;
		}
		public String getHouse() {
		return house;
		}
		public void setHouse(String house) {
		this.house = house;
		}
		public int getLand() {
		return land;
		}
		public void setLand(int land) {
		this.land = land;
		}
		@Override
		public String toString() {
		return "Parent [house=" + house + ", land=" + land + "]";
		}

		abstract public String readingPaper();

		}

