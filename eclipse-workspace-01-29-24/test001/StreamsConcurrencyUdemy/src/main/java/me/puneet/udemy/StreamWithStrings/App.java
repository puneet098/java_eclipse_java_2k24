package me.puneet.udemy.StreamWithStrings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Adam","Daniel","Martha","Kevin","Ben","Joe","Brad","Susan"};
		System.out.println("sorted");
		Stream.of(names).sorted().forEach(System.out::println);
		System.out.println("reverse sorted");
		Stream.of(names).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("Starts with B");
		Stream.of(names).filter(x -> x.startsWith("B")).forEach(System.out::println);
		System.out.println("Dealing with collections:: list");
		List<String> namesList = new ArrayList<>();
		namesList.add("Ana"); namesList.add("Adam"); namesList.add("Kevin");
		Stream<String> nameStream = namesList.stream();
		nameStream.forEach(System.out::println);
		//nameStream.forEach(System.out::println); stream has already been operated upon or closed
		namesList.stream().forEach(System.out::println);
		namesList.stream().forEach(System.out::println);
	}

}
