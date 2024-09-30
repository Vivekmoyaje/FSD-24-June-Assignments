package JAVA_Test;

//9. Write a program in to find the sum of all elements of the array

public class Que9 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int sum = 0;

		for (int ele : arr) {

			sum += ele;
		}

		System.out.println("The sum of all array element is : " + sum);

	}

}

//Output

//The sum of all array element is : 45
