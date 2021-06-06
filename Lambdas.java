package com.ss.jb.p5a1;

import java.util.Arrays;
import java.util.Comparator;

public class Lambdas {
	
	public static int helper(int first, int second)
	{
		return first - second;
	}
	public static int helper2(String a)
	{
		return a.contains("E")||a.contains("e") ? 0:1;
	}

	public static void main(String[] args) {
		// Array of strings
		String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
		     "Jupiter", "Saturn", "Uranus", "Neptune" };
			System.out.println(Arrays.toString(planets));
			
			//Sorted by length
			System.out.println("Sorted by length:");
			Arrays.sort(planets, (first, second) -> first.length() - second.length());	         
			System.out.println(Arrays.toString(planets));
			
			//Sort array by reverse length
			System.out.println("Sorted by reverse length:");
			Arrays.sort(planets, (first, second) -> second.length() - first.length());	         
			System.out.println(Arrays.toString(planets));
			
			//Sort Alphabetical
			System.out.println("Sorted by first letter:");
			Arrays.sort(planets, (first, second) -> first.charAt(0) - second.charAt(0));
			Arrays.asList(planets).forEach(System.out::println);
			
			//sort by contains 'e'
			System.out.println("Sorted by contains 'e':");
			Arrays.sort(planets, Comparator.comparing(a ->(a.contains("E")||a.contains("e") ? 0:1)));
			for(String planet : planets)
			{
				System.out.println(planet);
			}
			
			//with static helper
			System.out.println("Helper Sorted by length:");
			Arrays.sort(planets, (first,second) -> Lambdas.helper(first.length(),second.length()));
			System.out.println(Arrays.toString(planets));
			
			System.out.println("Helper Sorted by reverse length:");
			Arrays.sort(planets, (first,second) -> Lambdas.helper(second.length(),first.length()));
			System.out.println(Arrays.toString(planets));
			
			System.out.println("Helper Sorted by first letter:");
			Arrays.sort(planets, (first,second) -> Lambdas.helper(first.charAt(0),second.charAt(0)));
			Arrays.asList(planets).forEach(System.out::println);
			
			System.out.println("Helper Sorted by contains 'e':");
			Arrays.sort(planets, Comparator.comparing(a -> Lambdas.helper2(a)));
			for(String planet : planets)
			{
				System.out.println(planet);
			}
			
	}

}
