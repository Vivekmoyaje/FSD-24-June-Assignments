package JAVA_Test;

//7. Write a program to array elements print all Positive number

public class Que7 {

	public static void main(String[] args) {

		int arr[] = { 1, -6, 7, 8, -4, -6, 4, 2 };
		
		System.out.println("The possitive elements in array is : " );

		for (int ele : arr) {

			if (ele > 0) {

				System.out.println(+ ele);
			}
		}
	}

}

//Output:

//The possitive elements in array is : 
//1
//7
//8
//4
//2
