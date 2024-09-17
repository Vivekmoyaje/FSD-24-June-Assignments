package Arrays_Tasks;

//write a java program print Odd and Even Numbers from an Array

public class Print_EvenOdd {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 7, 2, 9, 12, 32, 5, 7 };

		System.out.println("Even numbers are : ");

		for (int even : arr) {

			if (even % 2 == 0) {
				System.out.println(even);
			}
		}
		
		System.out.println("Odd numbers are : ");

		for (int odd : arr) {
			
			if (odd % 2 != 0) {
				System.out.println(odd);
			}
		}
	}

}

//Output:

//Even numbers are : 
//4
//2
//12
//32
//Odd numbers are : 
//3
//7
//9
//5
//7
