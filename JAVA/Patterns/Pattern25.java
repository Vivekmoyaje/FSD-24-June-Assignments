package Patterns;

public class Pattern25 {

	public static void main(String[] args) {

		int a = 5;
		int dVal = 65;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (dVal + j - 1) + " ");
			}
			System.out.println();
		}

		for (int i = a; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print((char) (dVal + j - 1) + " ");
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
//A B C D 
//A B C 
//A B 
//A 
