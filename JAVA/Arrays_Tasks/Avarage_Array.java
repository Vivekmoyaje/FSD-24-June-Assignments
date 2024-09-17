package Arrays_Tasks;

import java.util.Scanner;

//Write a program to calculate the average value of array elements

public class Avarage_Array {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the Array : ");

		int length = input.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = input.nextInt();
		}

		int sum = 0;
		double average = 0;

		for (int A : arr) {

			sum += A;
		}
		
		average =  sum / length ;
		
		System.out.println("\n The Addition of the Array is : " + sum);
		System.out.println("\n The Average of the Array is : " + average);
		

	}

}

//Output:

//Enter length of the Array : 5
//arr[0] : 3
//arr[1] : 7
//arr[2] : 9
//arr[3] : 5
//arr[4] : 6
//
// The Addition of the Array is : 30
//
// The Average of the Array is : 6.0
