package com.javaintro.garbage;

public class Student3 {
	 static int stdId;
	 static String stdName;
	 static void method() {
		 Student3 s3=new Student3();
		 System.out.println(s3);
		 System.out.println(s3.hashCode());
		 
		 stdId=1;
		 stdName="sahithi";
		 System.out.println(stdId);
		 System.out.println(stdName);
		 
		 
		
		 
	 }
	@Override
	protected void finalize(){
		System.out.println("object is destroyed");
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		 
		 
		
		method();
		
		
		
		
		System.gc();
		
		

	}

}
