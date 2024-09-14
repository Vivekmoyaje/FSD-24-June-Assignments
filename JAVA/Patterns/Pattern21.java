package Patterns;

public class Pattern21 {

	public static void main(String[] args) {

		int a = 5;
		int dVal = 65;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) dVal + " ");
				dVal++;
			}
			System.out.println();
		}
	}

}

//A 
//B C 
//D E F 
//G H I J 
//K L M N O 