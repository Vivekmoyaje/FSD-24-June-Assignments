package Exception_Handling_Tasks;

//Exercise 2: Array Index Out of Bounds Exception
//Write a Java program that attempts to access an element at an invalid index in an array and handles the "ArrayIndexOutOfBoundsException" that may occur.

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};

		try {
			
			System.out.println("The Element is : " + arr[5]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {

			System.err.println("Exception cought : " + e.getMessage());
			System.err.println("Index is out of bound");
		}
	}

}
