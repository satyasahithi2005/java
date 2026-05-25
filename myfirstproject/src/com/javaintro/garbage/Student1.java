package com.javaintro.garbage;
class TestDemo2{
	@Override
	protected void finalize()  {
		System.out.println("object is destroyed");
	}
}

public class Student1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		TestDemo2 t1 = new TestDemo2();
		System.out.println(t1);
		TestDemo2 t2=new TestDemo2();
		System.out.println(t2);
		t1=t2;
		System.out.println(t1);
		System.out.println(t2);
		System.gc();
		

	}

}
