package Arrays_Tasks;

//Write a program copy all elements of one array into another array

public class Copy_Array1 {

	public static void main(String[] args) {

		int arr1[] = { 3, 6, 2, 9, 5, 8, 4 };

		int arr2[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		System.out.println("The original Array is : ");

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println("\n\n The Copy Array is : ");

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
