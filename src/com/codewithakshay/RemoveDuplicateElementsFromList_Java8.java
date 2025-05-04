package com.codewithakshay;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * 2) How do you remove duplicate elements from a list using Java 8 streams?
*/
public class RemoveDuplicateElementsFromList_Java8 {

	public static void main(String[] args) {

		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		
		Set<String> uniqueElements = listOfStrings.stream().collect(Collectors.toSet());
		
		System.out.println(uniqueElements);
		
//		BY USING DISTINCT()
		List<String> uniqueStrings = listOfStrings.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueStrings);

	}

}
