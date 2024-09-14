package Patterns;

public class Pattern17 {

	public static void main(String[] args) {

		int a = 5;
		int b = 1;

		for (int i = 1; i <= a; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(b + " ");
				b++;
			}

			System.out.println();
		}
	
	}

}

//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 

