package JAVA_Test;

//5. Write a program to array elements to print sum of Negative Numbers

public class Que5 {

	public static void main(String[] args) {

		int arr[] = { 1, -3, 5, -6, 8, 9, -4 };

		int sum = 0;

		for (int ele : arr) {

			if (ele < 0) {

				sum += ele;
			}

		}
		System.out.println("The sum of all negative numbers in array is : " + sum);
	}

}

//Output:

//The sum of all negative numbers in array is : -13
