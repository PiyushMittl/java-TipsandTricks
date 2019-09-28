package com.piyush.core.exceptions;

class Exc0 extends Exception{}
class Exc1 extends Exc0{}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exc1();
		} catch (Exc0 ex) {
			System.out.println("Exc0 caught");
		} catch (Exception ex) {
			System.out.println("Exception caught");
		} 
	}

}
