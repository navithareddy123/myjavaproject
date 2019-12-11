package com.home.loans.homeloans;

import java.util.Date;

public class A {
	public void m1()
	{
		System.out.println("method from class A");
	}
	static
	{
		Date dt=new Date();
		System.out.println(dt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new A();
		a.m1();
	}

}
