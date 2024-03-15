/**
 * Find number of times char-sequence is repeated.
 */
package com.sample.demo001;

import java.util.Scanner;

/**
 * 
 */
public class App {

	private static Scanner sc = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main String // Sub String ....");
		System.out.println("Enter main String....");
		String mainStr = sc.nextLine();
		System.out.println("Entered String"+mainStr);
		System.out.println("Enter sub String....");
		String subStr= sc.nextLine();
		System.out.println("Entered String"+subStr);
		int countRepeat = findRepeatCount(mainStr,subStr);
		System.out.println("Count Repeated is "+countRepeat);
		}
	
	private static int findRepeatCount(String mainStr,String subStr) {
		int tempCount = 0;
			while(mainStr.contains(subStr)) {
				mainStr=mainStr.replaceFirst(subStr, "");
				tempCount++;
			}
		return tempCount;
	}

}
