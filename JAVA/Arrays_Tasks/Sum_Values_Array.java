package Arrays_Tasks;

import java.util.Scanner;

public class Sum_Values_Array {

	public static void main(String[] args) {

		int arr[] = new int[5];

		int sum = 0;

		for (int i = 0; i < 5; i++) {

			Scanner input = new Scanner(System.in);

			System.out.printf("arr[%d] : ", i);
			arr[i] = input.nextInt();
		}

		for (int add : arr) {

			sum += add;
		}

		System.out.println("\n The sum of elements in Array is : " + sum);
	}

}

//Output:

//arr[0] : 34
//arr[1] : 45
//arr[2] : 567
//arr[3] : 46
//arr[4] : 68
//
// The sum of elements in Array is : 760
