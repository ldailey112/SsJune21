package com.ss.jb.lstreams;

import java.util.Arrays;

public class LambdaMain {

	public static void main(String[] args) 
	{
		testsGetString();
		testSearch();

	}
	
	public static void testsGetString()
	{
		LambdaStreams le = new LambdaStreams();
		System.out.println(le.getString(Arrays.asList(1,3,4,6)));
	}
	
	public static void testSearch() {
        LambdaStreams le = new LambdaStreams();
        Person p1 = new Person("ann");
        Person p2 = new Person("tom");
        Person p3 = new Person("Nik");
        System.out.println(le.search(Arrays.asList(p1, p2, p3)));
    }

}
