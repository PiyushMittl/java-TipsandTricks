package com.piyush.core.subclass;

 class Foo {

class Bar{}
}

public class Pack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Foo f =new Foo();
		//Foo.Bar b=new Foo.Bar();
		//Foo.Bar b=f.Bar();
		//Foo.Bar b=new f.Bar();
		Foo.Bar b=f.new Bar();
	}

}
