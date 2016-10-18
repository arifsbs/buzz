package com.exercise.collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.exercise.collections.FindItemLocation;

public class FindItemLocationTest {

	int[] integerArray1;
	int[] integerArray2;		

	@Before
	public void createAndInitlialiseArray()
	{
		integerArray1 = new int[]{2,3,4,5};
		integerArray2 = new int[]{4,5};				
	}

	@Test
	public void testLocateIndex()
	{
		assertEquals(2, new FindItemLocation().locateItemIndex(integerArray1, integerArray2));
	}

	@After
	public void cleanIntArrays()
	{
		integerArray1 = null;
		integerArray2 = null;				
	}
}
