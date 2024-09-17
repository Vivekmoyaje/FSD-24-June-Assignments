package Arrays_Tasks;

import java.util.Scanner;

//Write a program to array elements print all Negative number

public class Negative_Num_Array {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the Array : ");

		int length = input.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = input.nextInt();
		}

		System.out.println("\n Negative numbers are : ");

		for (int Neg : arr) {

			if (Neg < 0) {
				System.out.println(Neg);
			}
		}
	}

}

//Output:

//Enter length of the Array : 5
//arr[0] : 4
//arr[1] : -5
//arr[2] : -7
//arr[3] : 3
//arr[4] : 5
//
// Negative numbers are : 
//-5
//-7
