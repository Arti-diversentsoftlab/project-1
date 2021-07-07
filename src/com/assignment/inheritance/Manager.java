package com.assignment.inheritance;

public class Manager extends Employee {
	 public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	private int bonus;
	public Manager(String name, int salary, String address) {
		super(name, salary, address);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Manager m=new Manager("john",40000,"indore");
	 	m.setBonus(2000);
	 	int bonus=m.getBonus();
		String b=m.toString();
		System.out.println(m.toString()+","+"bonus:"+bonus);
	}
}
