package com.codewithakshay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 1) Given a list of integers, separate odd and even numbers
 */

public class SeparateOddEvenNumbers_CoreJava {
	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

		List<Integer> evenNumbers = new ArrayList<>();
		List<Integer> oddNumbers = new ArrayList<>();

		for (int i = 0; i < listOfIntegers.size(); i++) {
			if (listOfIntegers.get(i) % 2 == 0) {
				evenNumbers.add(listOfIntegers.get(i));
			} else {
				oddNumbers.add(listOfIntegers.get(i));
			}
		}
		System.out.println("Even Numbers : " + evenNumbers);
		System.out.println("Odd Numbers : " + oddNumbers);
	}
}
