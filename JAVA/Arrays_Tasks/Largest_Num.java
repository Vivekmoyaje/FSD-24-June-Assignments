package Arrays_Tasks;

//write a java program print the largest element in an array

public class Largest_Num {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 8, 12, 6, 23, 76, 9, 43 };

		int large = arr[0];

		for (int largest : arr) {

			if (largest>large) {
				
				large = largest;
			}
		}
		
		System.out.println("The largest number in given Array is : " +large);
	}

}

//Output:

//The largest number in given Array is : 76
