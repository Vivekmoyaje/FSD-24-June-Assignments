package Patterns;

public class Pattern20 {

	public static void main(String[] args) {

		int a = 5;
		int dVal = 65;

		for (int i = a; i >= 1; i--) {
			for (int j = a; j >= i; j--) {
				System.out.print((char)(dVal+j-1) + " ");
			}

			System.out.println();
		}
	}

}

//E 
//E D 
//E D C 
//E D C B 
//E D C B A 