package Patterns;

public class Pattern22 {

	public static void main(String[] args) {

		int a = 5;

		for (int i = 1; i <= a; i++) {

			for (int j = a; j >= i; j--) {
				System.out.print(" ");
			}

			int val = 1;

			for (int k = 1; k <= i; k++) {
				
				System.out.print(val + " ");
				val = val * (i - k) / k;

			}
			System.out.println();

		}
	}
}

//         1 
//        1 1 
//       1 2 1 
//      1 3 3 1 
//     1 4 6 4 1 
