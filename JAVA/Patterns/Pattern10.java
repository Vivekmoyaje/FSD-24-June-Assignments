package Patterns;

public class Pattern10 {

	public static void main(String[] args) {

		int dVal = 65;
		int a = 5;

		for (int i = a; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" ");
			}
			for (int k = i; k <= a; k++) {
				System.out.print((char) (dVal + k - 1) + " ");
			}
			System.out.println();
		}
	}

}

//    E 
//   D E 
//  C D E 
// B C D E 
//A B C D E 