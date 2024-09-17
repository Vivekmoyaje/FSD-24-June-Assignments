package Arrays_Tasks;

//write a java program find Third Largest Number in an Array

public class Third_Largest_Num1 {

	public static int ThirdLarge(int arr[], int length) {

		int temp = 0;

		for (int i = 0; i < length; i++) {

			for (int j = i + 1; j < length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr[length - 3];
	}

	public static void main(String[] args) {

		int arr[] = { 4, 8, 2, 7, 9, 6, 0, };
		int arr1[] = { 34, 56, 79, 23, 687, 24, 7, 23, 68 };

		System.out.println("Third largest number is : " + ThirdLarge(arr, 7));
		System.out.println("Third largest number is : " + ThirdLarge(arr1, 9));

	}

}

//Output:

//Third largest number is : 7
//Third largest number is : 68


