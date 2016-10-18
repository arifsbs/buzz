package com.exercise.collections;

import org.apache.commons.lang.ArrayUtils;

//This class find items
public class FindItemLocation {

	public static void main(String[] args)  {

		int[] integerArray1 = new int[]{2,3,4,5};
		int[] integerArray2 = new int[]{4,5};
	
		new FindItemLocation().locateItemIndex(integerArray1, integerArray2);
	}

	public int locateItemIndex(int[] firstIntArray, int[] secondIntArray)
	{

		int indexOfIntalue4 = ArrayUtils.indexOf(firstIntArray, secondIntArray[0]);

		System.out.println("indexOfIntalue4: "+indexOfIntalue4);

		return indexOfIntalue4;
	}
}
