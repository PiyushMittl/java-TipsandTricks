package com.piyush.core.overriding;



class Super {

	public int i=0;
	public int j=10;

}
public class Sub extends Super {

	public Sub() {
		i=2;
		System.out.println(i);
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		Super s=new Sub();
	}

}
