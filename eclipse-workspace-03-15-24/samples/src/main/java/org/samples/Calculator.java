package org.samples;

/*
 * This class is referring to pass by value and pass by reference.
 * 
 */
class CommonVals{
	
	protected float PI = 3.14f;

	public float getPI() {
		return PI;
	}
	
	
}

public class Calculator {

	protected String name;
	
	//Initialization block
	{
		this.name = "Puneet";
	}
	
	//pass by value
	public void modifyVal(int val) {
		
		val = val +10;
		System.out.println("pass by value ===>"+ val);
	}
	
	//pass by reference
	public float areaCricle(CommonVals objCV, float r) {
		
		float area = objCV.getPI()*r*r;
		
		//Modifying value of PI
		objCV.PI = 3.15f;
		//System.out.printf("Modified value of PI %03.2F ==> ",+objCV.PI);
		
		return area;
	}
	
	//Variable Argument Method Varargs
	public void multiplyVals(int... vals) {
		int result = 1;
		
		for(int y: vals) {
			result = result*y;
		}
		
		System.out.println("Multiplication of numbers is ==> "+ result);
	}
	
	
}
