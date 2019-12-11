package com.home.loans.homeloans;

public class DemoClass {
	public void add()
	{
		int a=3, b=4,c;
		c=a+b;
		System.out.println(c);
		
	}
	
	public void sub()
	{
		float x=2.5f, y=5.2f, z;
		z=x+y;
		System.out.println(z);
	}
	static String sno="krish";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	DemoClass dc=new DemoClass();
	dc.add();
	dc.sub();
	System.out.println(sno);
	
	}
	

}
