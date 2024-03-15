package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GenerateSeies {

	private static Integer given = 15;
	private static int[] intAry = {1,2,3,4,5,6,7,8,9};//This problem statement will require Dynamic Programming 

	public static void main(String[] args) {
		List<Integer> intListGiven = Arrays.stream(intAry).mapToObj(Integer::valueOf).toList();
		List<Integer> intList = new ArrayList<>();
		int tmpSum = 0;
		for(int i =0;i<=9;i++) {
			tmpSum = tmpSum + i;
			if(tmpSum <= given) {
				intList.add(i);
			}
		}

	}
}
