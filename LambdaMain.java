package com.ss.jb.lstreams;

import java.util.Arrays;

public class LambdaMain {

	public static void main(String[] args) 
	{
		testsGetString();

	}
	
	public static void testsGetString()
	{
		LambdaStreams le = new LambdaStreams();
		System.out.println(le.getString(Arrays.asList(1,3,4,6)));
	}

}
