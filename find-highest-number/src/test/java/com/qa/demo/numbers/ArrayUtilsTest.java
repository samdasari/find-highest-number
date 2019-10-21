package com.qa.demo.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class ArrayUtilsTest {

	@Test
	public void find_highest_in_empty_array() throws Exception {

		// Arrange

		int array[] = {};
		ArrayUtils cut = new ArrayUtils();

		try {
			// act

			int result = cut.findHighestNumber(array);
		} catch (Exception e) {

		}

		// assert

		assertTrue("Exception was thrown", true);

	}

	@Test
	public void find_highest_in_array_of_one() throws Exception {
		
		//Arrange
		
		int array[] = {33};
		ArrayUtils cut = new ArrayUtils();
		int expResult = 33;
		
		
		// act
			
		int result = cut.findHighestNumber( array );
		
		//assert
		
		assertEquals(expResult, result);
		
		}
	
	 @Test
	 public void find_highest_in_array_of_two_pre_ordered() throws Exception {
		
		//Arrange
		
		 int array[] = {44,33};
         ArrayUtils cut = new ArrayUtils();
		 int expResult = 44;
		
		
		// act
			
		int result = cut.findHighestNumber( array );
		
		//assert
		
		assertEquals(expResult, result);
		
		}
	 
	 @Test
	 public void find_highest_in_array_of_two_ascending() throws Exception {
		
		//Arrange
		
		 int array[] = {44,33};
         ArrayUtils cut = new ArrayUtils();
		 int expResult = 44;
		
		
		// act
			
		int result = cut.findHighestNumber( array );
		
		//assert
		
		assertEquals(expResult, result);
		
		}
	 
	 @Test
	 public void find_highest_in_array_of_any_number() throws Exception {
		
		//Arrange
		
		 int array[] = {10,4,33};
         ArrayUtils cut = new ArrayUtils();
		 int expResult = 33;
		
		
		// act
			
		int result = cut.findHighestNumber( array );
		
		//assert
		
		assertThat(result, is(expResult));
		
		}

}
