package com.javaintro.garbage;
class TestDemo1{
	int stdId;
	String stdName;
	
	@Override
	protected void finalize(){
		System.out.println("object is destroyed");
		
	}
}

public class Student {
	
	public static void main(String[] args) {
		System.out.println("main method started ");
		TestDemo1 t1 =new TestDemo1();
		System.out.println(t1);
		t1=null;
		
		System.out.println(t1);
		System.gc();
		

	}

}
