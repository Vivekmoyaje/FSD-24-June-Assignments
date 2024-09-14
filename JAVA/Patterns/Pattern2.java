package Patterns;

public class Pattern2 {

	public static void main(String[] args) {

//		method 1

		int dVal = 65;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print((char) (dVal + j - 1) + " ");
			}
			System.out.println();
		}

//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 

//      method 2

		for (int i = 65; i <= 69; i++) {
			for (int j = 65; j <= i; j++) {

				System.out.print((char) j + " ");
			}
			System.out.println();
		}
	}
}

//A 
//A B 
//A B C 
//A B C D 
//A B C D E 
