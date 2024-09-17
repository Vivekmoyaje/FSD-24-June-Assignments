package Arrays_Tasks;

import java.util.Arrays;
import java.util.Collections;

//Write a program to Sort Numeric Array In Descending Order

public class Descending1 {
	
	public static void main(String[] args) {
		
		Integer arr [] = {4,7,9,4,8,3,2,4,7,9};
		
		System.out.println("Original Array : " +Arrays.toString(arr));
		Arrays.sort(arr,Collections.reverseOrder());
		
		System.out.println("Sorted Array is : " + Arrays.toString(arr) );
	}
	

}
