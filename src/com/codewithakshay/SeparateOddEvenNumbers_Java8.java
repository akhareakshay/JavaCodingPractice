package com.codewithakshay;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SeparateOddEvenNumbers_Java8 {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

		Map<Boolean, List<Integer>> oddEvenMap = listOfIntegers.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));

		Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenMap.entrySet();

		for (Entry<Boolean, List<Integer>> entry : entrySet) {

			System.out.println("--------------------");

			if (entry.getKey()) {
				System.out.println("Even Numbers");
			} else {
				System.out.println("Odd Numbers");
			}

			System.out.println("--------------------");

			List<Integer> values = entry.getValue();
			for (int i : values) {
				System.out.println(i);
			}

		}

	}

}
