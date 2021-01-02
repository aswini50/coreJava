package coreJavaInterview;

import java.util.Arrays;

import org.junit.*;

public class ArrayPrograms {

	// WAP to find the missing number in integer array of 1 to 100
	@Test
	public void findMissingNumber() {
		int[] intArray = { 0, 2, 4, 3 };
		int intArrayLen = intArray.length + 1;
		System.out.println(intArrayLen);

		Arrays.sort(intArray);
		System.out.println(intArray.toString());
		for (int i = 0; i <= intArrayLen; i++) {
			System.out.println(intArray[i]);
			if (intArray[i] != i) {
				System.out.println("Missing number is : " + i);
				break;
			
			}
		}

/*
		int[] largeArray = null;
		int largeArrayLen = 100;
		//Data Creation
		for (int j=0;j<largeArrayLen-1;j++) {
			largeArray[j]=arr[j];
			System.out.println(largeArray[j]);
		}
		
		//Arrays.sort(intArray);
		//System.out.println(intArray.toString());
		for (int j = 0; j < largeArrayLen; j++) {
			//System.out.println(intArray[i]);
			if (largeArray[j] != j) {
				System.out.println("Missing number is : " + j);
				break;
			
			}
		}
		*/
	}

}
