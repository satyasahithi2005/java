package com.javaintro.garbage;
class Employee{
	int empId;
	String empName;
	@Override
	protected void finalize()  {
		System.out.println("finalize method called");
		
	}

}

public class Nullifying {

	public static void main(String[] args) {
		System.out.println("main method started");
		Employee e1=new Employee();
		System.out.println(e1);
		Employee e2=new Employee();
		System.out.println(e2);
		Employee e3=new Employee();
		System.out.println(e3);
		e1=null;
		e2=null;
		e3=null;
		System.gc();
		System.out.println("main method ended");
		
		
		
		
		
		
		

	}

}
