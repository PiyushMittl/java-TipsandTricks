package com.ituple.Integer;

import java.math.BigInteger;

public class Add50Digit {

	public static void main(String[] args) {
		
		String firstNumber="1232132142143243534564657658768769789780978097807907807896546534224567890";
		String secondNumber="123456745678456782345678945678990900909345893485948690548-06799856468005";
		
		BigInteger a = new BigInteger(firstNumber); 
		BigInteger b = new BigInteger(secondNumber);
		BigInteger result = a.add(b);
		System.out.println("Result is " + result.toString());
	}

}
