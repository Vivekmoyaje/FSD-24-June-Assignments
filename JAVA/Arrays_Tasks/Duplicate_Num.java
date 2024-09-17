package Arrays_Tasks;

//write a program given array find duplicate numbers

public class Duplicate_Num {

	public static void main(String[] args) {

		int arr[] = { 2, 7, 9, 5, 8, 34, 7, 3, 4, 6, 84, 3 };

		System.out.println("Duplicate numbers are : ");

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					System.out.println(arr[j]);
				}
			}
		}
	}

}

//Output:

//Duplicate numbers are : 
//7
//3
