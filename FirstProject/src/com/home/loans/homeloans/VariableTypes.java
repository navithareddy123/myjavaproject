package com.home.loans.homeloans;

public class VariableTypes
{
	int x=10;
	static String cname="krish";
	public void m1()
	{ 
		int w=30;
		System.out.println(w);
		System.out.println(cname);
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariableTypes vt=new VariableTypes();
		System.out.println(vt.x);
		System.out.println(vt.cname);
		System.out.println(cname);
		vt.m1();
		
}
	

}
