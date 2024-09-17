package Arrays_Tasks;

import java.util.Arrays;

//write a java program by using Array third largest number.

public class Third_Largest_Num {

	public static int ThirdLarge(int arr[], int length) {

		Arrays.sort(arr);

		return arr[length - 3];

	}

	public static void main(String[] args) {

		int arr[] = { 2, 6, 8, 4, 9, 5, 6 };

		int arr1[] = { 34, 7, 56, 78, 34, 6, 3, 67, 23 };

		System.out.println("Third largest number is : " + ThirdLarge(arr, 7));
		System.out.println("Third largest number is : " + ThirdLarge(arr1, 9));

	}

}

//Output : 

//Third largest number is : 6
//Third largest number is : 56
