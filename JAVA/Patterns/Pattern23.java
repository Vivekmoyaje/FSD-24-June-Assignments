package Patterns;

public class Pattern23 {

	public static void main(String[] args) {

		int a = 5;
		int dVal = 65;

		for (int i = 1; i <= a; i++) {
			for (int j = a; j >= i; j--) {
				System.out.print(" ");
			}

			int val = 1;
			for (int k = 1; k <= i; k++) {
				System.out.print((char) (dVal - 1 + val) + " ");
				val = val * (i - k) / k;
			}

			System.out.println();
		}
	}

}

//          A 
//         A A 
//        A B A 
//       A C C A 
//      A D F D A 


