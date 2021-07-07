package com.assignment.inheritance;

public class Animal {

public void animalsound() {
	System.out.println("all animal have a their own voice...");
}
}
class pig extends Animal{

	//@Override
	public void animalsound() {
		System.out.println("wee wee...");
	//	super.animalsound();
	}
	
}

class main{
	public static void main(String[] args) {
		Animal a=new pig();
		a.animalsound();
		//System.out.println("dsdff");
	}
}
