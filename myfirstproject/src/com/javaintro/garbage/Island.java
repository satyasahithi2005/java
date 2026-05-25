package com.javaintro.garbage;

public class Island {
	@Override
	protected void finalize()  {
		System.out.println("finalize method called");
		
		
	}
	Island i;

	public static void main(String[] args) {
		System.out.println("main methos started");
		Island i1=new Island();
		Island i2=new Island();
		Island i3=new Island();
		i1.i=i3;
		i2.i=i1;
		i3.i=i2;
		i1=null;
		i2=null;
		i3=null;
		System.gc();

	}

}
