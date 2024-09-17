package Arrays_Tasks;

import java.util.Scanner;

//Write a program to store elements in an array and print it

public class Store_Element {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the Array : ");
		int length = input.nextInt();
		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.printf("arr[%d] :", i);
			arr[i] = input.nextInt();
		}
		System.out.println("\n Array Elements are : ");
		for (int ele : arr) {
			System.out.println(ele);
		}
	}
}

//Output:

//Enter length of the Array : 5
//arr[0] :4
//arr[1] :7
//arr[2] :9
//arr[3] :3
//arr[4] :6
//
// Array Elements are : 
//4
//7
//9
//3
//6
