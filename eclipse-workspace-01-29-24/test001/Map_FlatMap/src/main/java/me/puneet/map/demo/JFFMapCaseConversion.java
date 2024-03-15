package me.puneet.map.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JFFMapCaseConversion {

	private static String[] javaVersionAry = {"Java 1.7","Java 1.8","Java 1.9","Java 10","Java 11","Java 12","Java 17"};
	public static String[] pencilBoxItems = {"Pencil","Sharper","Pen","Eraser","Small Scale"};


	public static void main(String[] args) {
		Arrays.asList(javaVersionAry).stream()
		.map(e -> e.toLowerCase())
		.collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("Map Now");
		Arrays.asList(pencilBoxItems).stream()
		.sorted().map(e -> e.toUpperCase()
				.concat(" on the way to School")).sorted()
		.collect(Collectors.toList())
		.forEach(System.out::println);
		System.out.println("Pencil Box as list");
		Arrays.asList(pencilBoxItems).stream().toList().forEach(System.out::println);;
		System.out.println("FlatMap");
		Arrays.asList(javaVersionAry).stream()
			.flatMap(e -> Stream.of(e.toUpperCase(),e.toLowerCase(),e.concat("The Version")))
			.collect(Collectors.toList()).forEach(System.out::println);
		Arrays.asList(pencilBoxItems).stream().sorted()
			.flatMap(e -> Stream.of(e.toLowerCase(), e.toUpperCase(), e.concat("going to skool")))
			.collect(Collectors.toList()).forEach(System.out::println);
		}

}
