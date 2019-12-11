package com.home.loans.homeloans;

public class PrimitiveTypes 
{
	int z=100;
	
	static String sname="JAVA";
	public void add()
	{
		int a=3;
		System.out.println(a);
		System.out.println(z);
		
	}
	public static void sub()
	{
		System.out.println(sname);
		PrimitiveTypes pt= new PrimitiveTypes();
		pt.add();
		
		System.out.println(pt.z);
		sub();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimitiveTypes pt= new PrimitiveTypes();
		pt.add();
		sub();
		System.out.println(sname);
		System.out.println(pt.z);
		
	}
	

}
