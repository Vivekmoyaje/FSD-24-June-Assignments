package Patterns;

public class Pattern15 {

	public static void main(String[] args) {

		int a = 5;

		for (int i = 1; i <= a; i++) {

			for (int j = 5; j >= i; j--) {

				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

//5 4 3 2 1 
//5 4 3 2 
//5 4 3 
//5 4 
//5 
