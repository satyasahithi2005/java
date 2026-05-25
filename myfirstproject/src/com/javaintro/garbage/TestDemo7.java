package com.javaintro.garbage;

public class TestDemo7 {
	String name="sahithi";
	@Override
	protected void finalize() {
		System.out.println("finalize method called");
		
	}
	void m1() {
		TestDemo7 t = new TestDemo7();
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TestDemo7 t1=new TestDemo7();
		TestDemo7 t2=new TestDemo7();
		System.out.println(t2);
		TestDemo7 t3=new TestDemo7();
		//nullifying the object
		t1=null;
		//Reassigning the object
		TestDemo7 t4=new TestDemo7();
		System.out.println(t4);
		t4=t2;
		System.out.println(t3.name);
		
		System.out.println(t4);
		t4.name="satya";
		System.out.println(t2);
		System.out.println("checking:"+t2.name);
		//Anonymous object creation
		System.out.println(new TestDemo7().name);
		//Object inside the method
		t4.m1();
		
		System.gc();
		System.out.println("main method ended");
		
	}

}
