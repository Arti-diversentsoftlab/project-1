package com.assignment.inheritance;

public class story {
public static void story() {
	System.out.println("super class story");
}
}
class bookstory extends story {
	public static void story(){
		System.out.println("sub class book story");
	}
}

class teststory{
	public static void main(String[] args) {
		story s= new bookstory();
		story s1=new story();
	}
}
