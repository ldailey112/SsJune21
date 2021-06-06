package com.ss.jb.tests;
//Create a file called LineTest.java. 
//Create tests for the getSlope, getDistance, 
//and parallelTo methods.
//Because of rounding errors, it is bad practice to test 
//double values for exact equality. 
//To get around this, you can pass a small value (such as .0001) 
//to assertEquals to be used as a delta.
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import com.ss.jb.p1a3.Line;

public class LineTest 
{
	
	Line line = new Line(1.0, 2.0, 1.0, 2.0);
	Line line1 = new Line(1.0, 2.0, 1.0, 2.0);
		
		@Test
		public void testGetSlope()
		{
			System.out.println("test case getSlope");
			assertEquals(.75, line.getSlope(), .0001);
			assertNotEquals(.01, line.getSlope(),.0001);
		
		}
		
		@Test
		public void testGetDistance()
		{
			System.out.println("test case getDistance");
			assertEquals(5.0, line.getDistance(), .0001);
			assertNotEquals(.01, line.getDistance(), .0001);
			
		}
		
		@Test
		public void testParallelTo()
		{
			System.out.println("test case getParallel");
			assertEquals(true, line.parallelTo(line1));
			assertNotEquals(false, line.parallelTo(line1));
		}

}
