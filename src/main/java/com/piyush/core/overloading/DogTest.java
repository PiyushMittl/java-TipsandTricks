package com.piyush.core.overloading;

class Animal2 {
}

class Dog extends Animal2 {
}

public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal2 a1 = d;
		// upcast ok with no explicit cast
		Animal2 a2 = (Animal2) d;
		// upcast ok with an explicit cast
		
		Dog a3=new Dog();
		Animal2 a4=(Animal2)a3;
	}
}
