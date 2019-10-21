package com.qa.demo.numbers;

public class ArrayUtils {

	
	public int findHighestNumber(int[] array) throws Exception
	
	{ 
		
		if ( array.length < 1)
			throw new Exception();
		
		int highestSoFar = Integer.MIN_VALUE;
		
		for( int i = 0; i < array.length;i++)
		{
		
	    if ( array[i] > highestSoFar)
			highestSoFar = array[i];
		}
		
		return highestSoFar;
	}

	
}
