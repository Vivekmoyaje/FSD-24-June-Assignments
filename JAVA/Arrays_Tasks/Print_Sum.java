package Arrays_Tasks;

//write a java program print the sum of all the items of the array

public class Print_Sum {

	public static void main(String[] args) {

		int arr[] = { 2, 6, 9, 8, 4, 7, 5, 3, 6 };

		int sum = 0;

		for (int add : arr) {

			sum += add;
		}
		
		System.out.println("The sum of the elements of Array is : " + sum);

	}

}

//Output:

//The sum of the elements of Array is : 50
