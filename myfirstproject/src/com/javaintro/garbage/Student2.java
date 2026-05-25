package com.javaintro.garbage;
class TestDemo3{
    static  int id=123;
	@Override
	protected void finalize()  {
		System.out.println("object is destroyed");
		
	}
}

public class Student2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		new TestDemo3();
		System.out.println("checking:"+ TestDemo3.id);
		System.gc();
		System.out.println("main method ended");
		
		
		
	}

}
