package Patterns;

public class Pattern8 {

	public static void main(String[] args) {

		int a = 5;

		for (int i = a; i >= 1; i--) {

			for (int j = 1; j < i; j++) {

				System.out.print(" ");
			}
			for (int k = i; k <= a; k++) {
				System.out.print(k + " ");
			}

			System.out.println();
		}
	}
}

//        5 
//       4 5 
//      3 4 5 
//     2 3 4 5 
//    1 2 3 4 5 
