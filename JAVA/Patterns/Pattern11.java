package Patterns;

public class Pattern11 {

	public static void main(String[] args) {

		int a = 5;

		for (int i = 1; i <= a; i++) {

			for (int j = a; j >= i; j--) {

				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

}

//     *
//    ***
//   *****
//  *******
// *********
