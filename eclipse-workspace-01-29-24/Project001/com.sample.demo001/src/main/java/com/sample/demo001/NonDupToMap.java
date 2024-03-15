package com.sample.demo001;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonDupToMap {
	
	private static String [] fruits = {"apple","mango","lichi","anar"};
	private static String [] fruits01 = {"pineapple","apple","papaya","mango"};

	public static void main(String[] args) {
		int len = fruits.length;
		List<String> strList = Arrays.asList(fruits);
		List<String> strList01 = Arrays.asList(fruits01);
		List<String> str01 = strList.stream().filter(strList01::contains)
		.collect(Collectors.toList());
		System.out.println(str01);
		List<String> str02 = strList.stream()
								.filter(e -> !strList01.contains(e))
								.collect(Collectors.toList());
		System.out.println(str02);
		List<String> str03 = strList01.stream()
					.filter(e -> !strList.contains(e))
				.	collect(Collectors.toList());
		System.out.println(str03);
		
	}

}