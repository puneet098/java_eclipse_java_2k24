package org.samples;

public class App {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		//initialization block
		System.out.println(cal.name);
		
		//pass by value
		int val = 10;
		
		cal.modifyVal(val);
		System.out.println("Value of val after passing as value is "+ val);
		
		//pass by reference
		CommonVals cv = new CommonVals();
		
		System.out.printf("Area of circle is %03.2f",cal.areaCricle(cv, val));
		//printf We specify the formatting rules using the format parameter. 
		//Rules start with the % character.
		System.out.printf("\n Modified value of PI is %01.2f %n",cv.getPI());
		
		//variable argument method
		cal.multiplyVals(1,3,5,7);
	}

}
