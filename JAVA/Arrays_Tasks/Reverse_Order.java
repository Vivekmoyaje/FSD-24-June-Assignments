package Arrays_Tasks;

//write a program to print values in reverse order

public class Reverse_Order {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Original Array is : ");

		for (int orig : arr) {

			System.out.print(orig + " ");
		}
		
		System.out.println("\n\n Reverse order Array is : ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}

//Output:

//Original Array is : 
//1 2 3 4 5 6 7 8 9 
//
// Reverse order Array is : 
//9 8 7 6 5 4 3 2 1 

