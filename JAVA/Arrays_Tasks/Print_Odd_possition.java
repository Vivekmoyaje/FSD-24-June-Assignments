package Arrays_Tasks;

//write a java program print the elements of an array present on odd position

public class Print_Odd_possition {

	public static void main(String[] args) {

		int arr[] = { 2, 6, 8, 1, 9, 5, 8, 3, 4, 3 };

		System.out.println("The elements are present in odd possition is : ");

		for (int i = 0; i < arr.length; i += 2) {

			System.out.println(arr[i]);
		}
	}

}

//Output:

//The elements are present in odd possition is : 
//2
//8
//9
//8
//4