package Patterns;

public class Pattern14 {

	public static void main(String[] args) {

		int a = 5;

		for (int i = a; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		
	}

}

//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1 