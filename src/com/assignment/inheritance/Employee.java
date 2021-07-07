package com.assignment.inheritance;

public class Employee {
	public String name;
	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary + ", address=" + address + "";
	}
	private int salary;
	 private String address;
	 public Employee( String name,int salary,String address) {
		 this.name=name;
		 this.salary=salary;
		 this.address= address;
	 }
/*	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = a*/

}
