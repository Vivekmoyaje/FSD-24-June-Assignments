package JAVA_Test;

//2. Write a program to array elements print all Even number

public class Que2 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("The even numbers in the array is : ");

		for (int ele : arr) {

			if (ele % 2 == 0) {

				System.out.println(ele);
			}
		}
	}

}

//Output:

//The even numbers in the array is : 
//2
//4
//6
//8