package Arrays_Tasks;

//writw a java program sort the elements of an array in ascending order

public class Ascending_Array {

	public static void main(String[] args) {

		int arr[] = { 3, 7, 2, 9, 3, 4, 1 };

		System.out.println("Elements of original Array is : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("\n\n The sorted Array is : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

//Output:

//Elements of original Array is : 
//3 7 2 9 3 4 1 
//
// The sorted Array is : 
//1 2 3 3 4 7 9 