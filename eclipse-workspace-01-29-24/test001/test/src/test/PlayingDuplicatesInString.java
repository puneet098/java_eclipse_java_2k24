package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PlayingDuplicatesInString {

	//java 8
	private String removeDuplicateBySplitting(String givenStr) {
		String str = Arrays.asList(givenStr.split(" ")).stream().distinct().collect(Collectors.joining());
		return str;
	}
	//prev without Java 8 
	private String removeDuplicateBySBHS(String givenStr) {

		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<>();

		char[] charAry = givenStr.toCharArray();
		for(Character ch:charAry) {
			if(set.add(ch))
				sb.append(ch);
		}

		return sb.toString();
	}

	//Get Duplicate Characters in string 
	private List<String> getDuplicateCharJDK8(String givenStr) {
		List<String> dupList = Arrays.stream(givenStr.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		return dupList; 
	}

	//Get Duplicate Character count in string
	private Map<String,Integer> getDuplicateCharCountJDK8(String givenStr) {
		List<String> charList = Arrays.stream(givenStr.split("")).toList();
		System.out.println("character list::=> "+charList);

		Map<String,Integer> charWithCount = charList.stream()
				.collect(Collectors.toMap(Function.identity(),ch -> 1, Math::addExact));
		System.out.println("character Map with count::=> "+charWithCount);

		Map<String,Integer> charWithDupCount = charWithCount.entrySet().stream()
				.filter(e -> e.getValue() > 1).collect(Collectors.toMap(Entry::getKey, Entry::getValue));

		return charWithDupCount;
	}
	
	//Get Duplicate Words count in string
		private Map<String,Integer> getDuplicateWordsCountJDK8(String givenStr) {
			List<String> wordList = Arrays.stream(givenStr.split(" ")).toList();
			System.out.println("Words list::=> "+wordList);

			Map<String,Integer> wordsWithCount = wordList.stream()
					.collect(Collectors.toMap(Function.identity(),ch -> 1, Math::addExact));
			System.out.println("Words Map with count::=> "+wordsWithCount);

			Map<String,Integer> wordsWithDupCount = wordsWithCount.entrySet().stream()
					.filter(e -> e.getValue() > 1).collect(Collectors.toMap(Entry::getKey, Entry::getValue));

			return wordsWithDupCount;
		}


	public static void main(String[] args) {
		PlayingDuplicatesInString pdis = new PlayingDuplicatesInString();
		String input="Java is a programming technologies and Java is backend technologies";
		String myName="puneet pandey";

		System.out.println("Remove Dupilcate with Java8 for given string --->"+input);
		System.out.println(pdis.removeDuplicateBySplitting(input));
		//System.out.println(myName.concat(" puneet"));
		System.out.println(pdis.removeDuplicateBySplitting(myName.concat(" puneet")));
		System.out.println("Remove Dupilcate without Java8 for given string --->"+input);
		System.out.println(pdis.removeDuplicateBySBHS(input));
		System.out.println("Get Dupilcate Characters using Java8 for given string ---> "+input+" , "+myName);
		System.out.println(pdis.getDuplicateCharJDK8(myName));
		System.out.println(pdis.getDuplicateCharJDK8(input));
		System.out.println("Get Dupilcate Characters Count using Java8 for given string ---> "+input+" , "+myName);
		System.out.println(pdis.getDuplicateCharCountJDK8(myName));
		System.out.println(pdis.getDuplicateCharCountJDK8(input));
		System.out.println("Get Dupilcate Words Count using Java8 for given string ---> "+input+" , "+myName);
		System.out.println(pdis.getDuplicateWordsCountJDK8(myName.concat(" puneet")));
		System.out.println(pdis.getDuplicateWordsCountJDK8(input));
	}

}
