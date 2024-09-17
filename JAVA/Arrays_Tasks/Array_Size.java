package Arrays_Tasks;

import java.util.Scanner;

//Write a program in to array size to be user input print it.

public class Array_Size {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length of the Array : ");
		
		int length = input.nextInt();
		
		int arr [] = new int [length];
		
		for(int i=0;i<length;i++) {
			System.out.printf("arr[%d] : ",i);
			arr[i] = input.nextInt();
		}
		
		System.out.println("\n Array Elements are : ");
		
		for(int ele:arr) {
			System.out.println(ele);
		}
	}
}

//Output:

//Enter length of the Array : 4
//arr[0] : 2
//arr[1] : 4
//arr[2] : 6
//arr[3] : 3
//
// Array Elements are : 
//2
//4
//6
//3
