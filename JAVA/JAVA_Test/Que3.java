package JAVA_Test;

//3. Write a program to array elements print all Odd number

public class Que3 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("The odd numbers in the array is : ");

		for (int ele : arr) {

			if (ele % 2 == 1) {

				System.out.println(ele);
			}
		}
	}

}

//Output:

//The odd numbers in the array is : 
//1
//3
//5
//7
//9
