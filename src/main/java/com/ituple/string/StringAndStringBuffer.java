package com.ituple.string;

public class StringAndStringBuffer {

	public static void main(String a[])
	{
		String str=new String("piyush");
		StringBuffer stringBuffer=new StringBuffer("piyush");
		
		//false because equals internally check "instance of" and String is not an instance of StringBuffer		
		System.out.println(str.equals(stringBuffer));
	}
	
}
