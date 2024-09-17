package Arrays_Tasks;

import java.util.Scanner;

//Write a program to array elements to print cubic values

public class Cubic_Array {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length of the Array : ");
		
		int length = input.nextInt();
		int arr[] = new int [length];
		
		for(int i=0;i<length;i++) {
			System.out.printf("arr[%d] : ",i);
			arr[i] = input.nextInt();
		}
		
		System.out.println("\n Cubic array is : ");
		
		for(int cube:arr) {
			System.out.println(cube*cube*cube);
		}
		
	}

}

//Output;

//Enter length of the Array : 4
//arr[0] : 4
//arr[1] : 7
//arr[2] : 9
//arr[3] : 15
//
// Cubic array is : 
// 64
// 343
// 729
// 3375
