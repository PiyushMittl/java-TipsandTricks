package com.piyush.core.generics;
import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	/**
	 * method can accept only List of Object ex. List<Object> listOfString=new
	 * ArrayList(); else it will throw error
	 * 
	 * @param list
	 */
	public static void isNotGenerics(List<Object> list) {

	}

	/**
	 * method can accept any type of list ex. List<Object> listOfObject=new
	 * ArrayList(); List<String> listOfString=new ArrayList(); List<GenericsTest>
	 * listOfGenericTest=new ArrayList(); else it will throw error
	 * 
	 * @param list
	 */
	public static void isGenerics(List<?> list) {

	}

	public static void main(String[] args) {

		List<GenericsTest> listOfString = new ArrayList();
		listOfString.add(new GenericsTest());

		isGenerics(listOfString); // no error
		//isNotGenerics(listOfString); // error

	}
}