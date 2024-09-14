package Patterns;

public class Pattern18 {

	public static void main(String[] args) {

		int dVal = 65;
		int a = 5;

		for (int i = a; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (dVal + j - 1) + " ");
			}

			System.out.println();

		}
	}

}

//A B C D E 
//A B C D 
//A B C 
//A B 
//A 
