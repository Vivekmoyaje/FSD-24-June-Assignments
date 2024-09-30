package JAVA_Test;

import java.util.Arrays;

//1. Write a program to copy the elements of one array into another array

public class Que1 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int copyArr[] = Arrays.copyOf(arr, arr.length);

		System.out.println("Original array is : " + Arrays.toString(arr));

		System.out.println("Copy array is : " + Arrays.toString(copyArr));
	}

}

//Output:

//Original array is : [1, 2, 3, 4, 5, 6]
//Copy array is : [1, 2, 3, 4, 5, 6]