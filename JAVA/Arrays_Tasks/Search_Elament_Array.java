package Arrays_Tasks;

import java.util.Scanner;

//Write a program to search an element in an array

public class Search_Elament_Array {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the Array : ");

		int length = input.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = input.nextInt();
		}
		
	     System.out.print("Enter the search array element : ");
	     
	     int val = input.nextInt();
	     
	     for(int i=0;i<length;i++) {
	    	 
	    	 if(arr[i]==val) {
	    		 
	    		 System.out.printf("The element found at the possition : %d " , i+1);
	    		 System.out.printf("\n The element found at the index : %d ", i);
	    	 }
	     }

	}

}

//Output:

//Enter length of the Array : 4
//arr[0] : 1
//arr[1] : 2
//arr[2] : 3
//arr[3] : 4
//Enter the search array element : 3
//The element found at the possition : 3 
// The element found at the index : 2 
