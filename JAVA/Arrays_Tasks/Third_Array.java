package Arrays_Tasks;

import java.util.Scanner;

//Write a program to merge two arrays elements to store third array

public class Third_Array {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the first Array : ");

		int aLength = input.nextInt();
		int a[] = new int[aLength];

		System.out.print("Enter length of the second Array : ");

		int bLength = input.nextInt();
		int b[] = new int[bLength];

		int merg[] = new int[100];
		int mergL = 0;

		System.out.println("Elements of first Array : ");
		for (int i = 0; i < aLength; i++) {

			System.out.printf("a[%d] : ", i);
			a[i] = input.nextInt();
		}

		System.out.println("Elements of second Array : ");
		for (int i = 0; i < bLength; i++) {
			System.out.printf("b[%d] : ", i);
			b[i] = input.nextInt();
		}

		for (int i = 0; i < aLength; i++) {
			merg[mergL] = a[i];
			mergL++;
		}

		for (int i = 0; i < bLength; i++) {
			merg[mergL] = b[i];
			mergL++;
		}
		
		System.out.println("\n Merge two Array Elements is : ");

		for (int i = 0; i < mergL; i++) {

			System.out.printf("\n merg[%d] = %d", i, merg[i]);
		}

	}

}

//Output: 

//Enter length of the first Array : 3
//Enter length of the second Array : 4
//Elements of first Array : 
//a[0] : 3
//a[1] : 5
//a[2] : 7
//Elements of second Array : 
//b[0] : 2
//b[1] : 4
//b[2] : 6
//b[3] : 8
//
//Merge two Array Elements is : 
//
// merg[0] = 3
// merg[1] = 5
// merg[2] = 7
// merg[3] = 2
// merg[4] = 4
// merg[5] = 6
// merg[6] = 8
