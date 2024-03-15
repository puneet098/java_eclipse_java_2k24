package test;

import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World");
		String A = "abc";
		char[] aAry = A.toCharArray();
	
		Integer[] intArry = {0,1,2,3,6,7,8,9};
		Integer tempSum = 10;
		int k = intArry.length;
		for(int i = 0; i < k; i++) {
			for(int j=i+1; i< k; j++) {
				int sum = intArry[i ]+ intArry[j];
				if(tempSum == sum) {
					System.out.println("pair is --->"+intArry[i]+"::"+intArry[j]);
					break;
				}
			}
		}
	}

}
