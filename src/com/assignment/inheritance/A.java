package com.assignment.inheritance;

public class A {
	public A() {
	System.out.println(" A class ....");
}
	

}
 class B extends A{
	public B() {
		System.out.println("B class....");
	}
}
class C extends B{
	public C() {
		System.out.println("C class.....");
	}
}


class ABC{
	public static void main(String[] args) {
		C c=new C();
		
	}
}