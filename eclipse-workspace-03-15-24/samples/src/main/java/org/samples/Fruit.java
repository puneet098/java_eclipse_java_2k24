package org.samples;

abstract  class Apple {
	int size;
	int color;
	String fruit;
	
	public String myFruit() {
		fruit = "Apple";
		System.out.println(fruit);
		return fruit;
	}

	abstract String getFruit();
	
}
public class Fruit extends Apple{

	@Override
	String getFruit() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


