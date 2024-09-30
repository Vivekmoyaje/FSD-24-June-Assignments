package JAVA_Test;

//8. Write a program to calculate the average value of array elements

public class Que8 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int length = arr.length;

		int sum = 0;

		for (int ele : arr) {

			sum += ele;
		}

		int average = sum / length;

		System.out.println("The average of an array elements is : " + average);
	}

}

//Output:

//The average of an array elements is : 5
