package com.piyush.core.blocks;
import java.util.*;


@SuppressWarnings("rawtypes")
public class InitBlock {

	String s=new String();
	
	{
		{
			final Vector v;
			v=new Vector();
		}
	}
	
	public InitBlock() {}
	
	public void codeMethod() {
		System.out.println(s);
		System.out.println(v);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
