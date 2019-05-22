package com.piyush.core.overloading;

class Overloading2 {
	public void doStuff(Integer i) {
		System.out.println("Integer method called");
	}

	public void doStuff(double d) {
		System.out.println("double method called");
	}

	public void doStuff(float d) {
		System.out.println("float method called");
	}

	
	public static void main(String[] args) {
		Overloading2 o2=new Overloading2();
		o2.doStuff(10.5);
		//double method called (floating point numbers are treated as double by default)
		o2.doStuff(10);
		//float method would be called by default (boxing to wrapper has least priviledge)
	}
}


