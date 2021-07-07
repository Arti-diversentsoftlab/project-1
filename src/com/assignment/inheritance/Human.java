package com.assignment.inheritance;

public class Human {
	 public void eyes() {
		 System.out.println("eyes is a general  property for all human");
	 }
	 public void voice() {
		 System.out.println("eyes is a general  property for all human");
	 }  

}

class child extends Human{
	
	@Override
	public void eyes() {
		// TODO Auto-generated method stub
		super.eyes();
	}

	@Override
	public void voice() {
		// TODO Auto-generated method stub
		super.voice();
	}

	public void age() {
		System.out.println("age specifice property for all child...");
	}
}
 class mainhuman{
	 public static void main(String[] args) {
		Human h=new Human();
		child c=new child();
	c.voice();//general
	c.eyes();//general 
	c.age();//specific behaviour
		
	}
 }