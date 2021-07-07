package com.assignment.inheritance;

public class Manager1 extends Employee1 {
	static int sal=20000;
@Override
	public void getsalary(int salary) {
		// TODO Auto-generated method stub
		super.getsalary(salary);
	}

public static void main(String[] args) {
	Employee1 m=new Manager1();
	m.getsalary(sal);
}
	
	

}
