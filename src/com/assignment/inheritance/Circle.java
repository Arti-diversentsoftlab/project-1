package com.assignment.inheritance;

public class Circle  extends Shap {
	private  int radius=3;
	Shap s=new Shap();
	@Override
	public double area() {
		return 2*3.14*radius;
		
	}
	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "green";
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		System.out.println("area of circle:"+c.area()+"\n"+"color of circle:"+c.color());
	}
}

