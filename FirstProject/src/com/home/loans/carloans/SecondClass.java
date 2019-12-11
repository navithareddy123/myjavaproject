package com.home.loans.carloans;

public class SecondClass {
	
	int a=30,b=10,c;
		
	public void sum()
	{
		c=a+b;
		System.out.println("sum of two nos : " + c);
	}
	public void sub()
	{
		c=a-b;
		System.out.println("sub of two nos : "+ c);
			
	}
	

	public static void main(String[] args) {
		System.out.println("second class");
		SecondClass sc=new SecondClass();
		sc.sum();
		sc.sub();
		System.out.println(sc.c);
	}
}
