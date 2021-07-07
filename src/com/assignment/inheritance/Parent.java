package com.assignment.inheritance;

public class Parent {
	public  void parent() {
		System.out.println("parent");
	}
}
class Child extends Parent{
	public void child() {
		System.out.println("child");
	}
}
class testparent{
	public static void main(String[] args) {
		///parent p=new parent();
		Child c=new Child();
		if(c instanceof Child) {
			System.out.println("yes");
			
		}else if(c instanceof Parent){
			System.out.println("yes");
		} else if(c instanceof Object) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
