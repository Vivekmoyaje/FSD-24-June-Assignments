package Patterns;

public class Pattern19 {

	public static void main(String[] args) {

		int dVal = 65;
		int a = 5;

		for (int i = 1; i <= a; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print((char) (dVal + j - 1) + " ");
			}
			System.out.println();
		}
	}

}

//E D C B A 
//E D C B 
//E D C 
//E D 
//E 
