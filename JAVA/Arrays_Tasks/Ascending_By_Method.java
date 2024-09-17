package Arrays_Tasks;

import java.util.Arrays;

//Write a program to Sort Numeric Array In Ascending Order

public class Ascending_By_Method {

	public static void main(String[] args) {

		int arr[] = { 3, 6, 2, 9, 1, 5 };

		System.out.println("Original array is : " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("The Sorted Array is : " + Arrays.toString(arr));
	}

}
//Output:

//Original array is : [3, 6, 2, 9, 1, 5]
//The Sorted Array is : [1, 2, 3, 5, 6, 9]
