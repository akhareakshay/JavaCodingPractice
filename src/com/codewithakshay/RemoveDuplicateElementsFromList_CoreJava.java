package com.codewithakshay;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 2) How do you remove duplicate elements from a list using Core Java
*/

public class RemoveDuplicateElementsFromList_CoreJava {

	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

		Set<String> uniqueStrings = new HashSet<>();
		
		for(int i = 0; i < listOfStrings.size(); i++) {
			uniqueStrings.add(listOfStrings.get(i));
		}
		
		System.out.println(uniqueStrings);
	}

}
