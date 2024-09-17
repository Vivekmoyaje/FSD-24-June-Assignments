package Arrays_Tasks;

import java.util.Scanner;

//Write a program to array elements print all Even number

public class EvenNumber_Array {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the array : ");

		int length = input.nextInt();
		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = input.nextInt();
		}
		
		System.out.println("\nThe Even numbers are : ");
		
		for(int even:arr) {
			if(even%2==0) {
				System.out.println(even);
			}
		}

	}

}

//Output:

//Enter length of the array : 4
//arr[0] : 1
//arr[1] : 2
//arr[2] : 3
//arr[3] : 4
//
//The Even numbers are : 
//2
//4
