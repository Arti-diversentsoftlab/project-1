package com.assignment.inheritance;

public class SuperAndThis {
		public void m1() {
			SuperAndThis a = this ;
		} 
		}
		class superAndThis1 extends SuperAndThis {
		public void m2() {
		A a = super; // this will give error since super is not a reference
		} }


