package Patterns;

public class Pattern7 {

	public static void main(String[] args) {

		int a = 5;

		for (int i = 1; i <= a; i++) {

			for (int j = a; j >= i; j--) {

				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {

				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}

//        1 
//       1 2 
//      1 2 3 
//     1 2 3 4 
//    1 2 3 4 5 
