package com.javaintro.garbage;

public class Reassigning {
	@Override
	protected void finalize() {
		System.out.println("finalize method called");
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Reassigning r1=new Reassigning();
		System.out.println(r1);
		Reassigning r2=new Reassigning();
		System.out.println(r2);
		r1=r2;
		System.out.println(r1);
		System.out.println(r2);
		System.gc();
		System.out.println("main method ended");
		
		
		
		
		
		

	}

}
