package me.puneet.udemy.StreamWithNumbers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {
		//IntStream.range(1, 10).forEach(System.out::print);
		//IntStream.range(1, 10).forEach(x -> System.out.print(x+" "));
		//IntStream.range(1, 10).filter(x -> x > 4).forEach(x -> System.out.print(x+" "));
		IntStream.range(0 , 10).filter(x -> x%2 != 0).forEach(x -> System.out.print(x+" "));
		int[] nums = {1,5,3,-2,9,12};
		int sum = 0;
		for(int i = 0; i < nums.length;++i) {
			sum = sum + nums[i];
		}
			System.out.println(sum);
			//Lambda Expression
			//method reference
			Arrays.stream(nums).forEach(System.out::println);
			sum = Arrays.stream(nums).sum();
			System.out.println(sum);
	}

}
