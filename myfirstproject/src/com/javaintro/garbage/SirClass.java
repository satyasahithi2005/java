package com.javaintro.garbage;
class Students{
	int sid;
	String sname;
}

public class SirClass {

	void main(String[] args) {
		System.out.println("main method started");
		Students s1=new Students();
		System.out.println(s1);
		Students s2=new Students();
		System.out.println(s2);
		Students obj=new Students();
		System.out.println(obj);
		System.out.println(obj.hashCode());
		int a =0x251a69d7;
		System.out.println(a);
		
		
		
		

	}

}
