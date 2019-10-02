package com.piyush.core.overriding;

class Parent {
	protected static String s="Parent";
	public void print() {
		System.out.println(s);
	}
}
class Child1 extends Parent {
	static String s="Child1";
	public void print() {
		System.out.println(s);
	}
}

class Child2 extends Parent {
	static String s="Child2";
}

class Child3 extends Parent {
	static String s="Child3";
	public void print() {
		System.out.println(s);
	}
}

public class OverrideDemo1{
	public static void main(String[] args) {
//Question: can we override the data members
/*Tip 1 - accessing data member from parent reference*/		
		Parent p=new Child1();
		//method is always called from the object class not from the reference class (Parent is reference class and new Child() is object class)
		
		//method existence is checked from reference variable because is checked at compile time. 
		//when you compile your code the method existence will be checked from reference variable class only.
		//when you run your program the method from the object class gets executed which is called overriding.
		p.print();
		
		//in case of data members we do not have overriding facility instead we have hiding concept here.
		//data members  always be accessed from parent class because we bind data member's value at compile time and that time what we know we reference class 
		//thats why we get the value from reference class
		// say Parent p=args[0]  //here we do not know which class reference we are having here thats why it binds data member value from reference class only
		System.out.println(p.s);
		
//Question: data hiding works when we do not override the method
/*Tip 2*/		
		System.out.println("tip2");
		Parent p1=new Child2();//no overridden method in child
		p1.print();
		//here no hiding would happen because there is no method overriding 
		//reason: because if you do data hiding method might get corrupted because you might declare Object s=new ***() not string. which will cause a disaster.
		
		p1=new Child3();//overriding method
		p1.print();
		//here hiding would happen because child is having overridden method

//Question: can we down-cast parent reference having parent object. can we down-cast parent reference having child object. 		
/*Tip 3 - storing parent reference to child*/		
		System.out.println("---Tip3---");
		Parent p3=new Parent();
		//Parent p3=args[0]; //it can be anything
		//Child1 c3=(Child1)p3;//run time exception
		
		//c3.print();   ----> Break here, because c3 contains any object of Parent class and do not about Child object and its methods
		
		Parent p4=new Child1();
		Child1 c4=(Child1)p4;//works well

//Question: since we can not override data members, then how can we access child data members from parent reference variable containing child object.		
/*Tip 4 - accessing child data member using parent reference by down-casting */
		Parent p5=new Child1();
		System.out.println(((Child1)p5).s);//works well
		
		Parent p6=new Parent();
		System.out.println(((Child1)p6).s);//works well
		

//Question: is it possible to access parent data member by using child reference containing child object
/*Tip 5 - accessing parent data member using child reference by up-casting */
		Child1 c5=new Child1();
		System.out.println(((Parent)c5).s);//works well
		
	}
	
}