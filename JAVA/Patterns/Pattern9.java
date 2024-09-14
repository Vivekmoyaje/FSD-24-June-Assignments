package Patterns;

public class Pattern9 {

	public static void main(String[] args) {

		int dVal = 65;
		int a = 5;

		for (int i = 1; i <= a; i++) {

			for (int j = a; j >= i; j--) {

				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print((char) (dVal + k - 1) + " ");
			}

			System.out.println();
		}
	}

}

//       A 
//      A B 
//     A B C 
//    A B C D 
//   A B C D E 