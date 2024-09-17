package Arrays_Tasks;

//write a java program find smallest number

public class Smallest_Num {

	public static void main(String[] args) {

		int arr[] = { 5, 8, 9, 12, 32, 6, 32, 7 };

		int min = arr[0];

		for (int small : arr) {

			if (small < min) {

				min = small;
			}
		}

		System.out.println("The Smallest number in Array is : " + min);
	}

}

//Output:

//The Smallest number in Array is : 5
