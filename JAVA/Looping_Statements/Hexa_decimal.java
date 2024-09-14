package Looping_Statements;

import java.util.Scanner;

//Write a program to convert Hexadecimal to Decimal number system

public class Hexa_decimal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Hexa decimal number : ");

		String Hex = input.nextLine();

		System.out.println("Hexadecimal number : " + Hex);
		System.out.println("Decimal number : " + DecimalNumber(Hex));

	}

	static int DecimalNumber(String Hex_num) {

		int leng = Hex_num.length();
		int base = 1;
		int dec_val = 0;

		for (int i = leng - 1; i >= 0; i--) {
			if (Hex_num.charAt(i) >= '0' && Hex_num.charAt(i) <= '9') {
				dec_val += (Hex_num.charAt(i) - 48) * base;
				base = base * 16;
			} else if (Hex_num.charAt(i) >= 'A' && Hex_num.charAt(i) <= 'F') {
				dec_val += (Hex_num.charAt(i) - 55) * base;
				base = base * 16;
			}
		}
		return dec_val;
	}

}

//Output : 

//Enter Hexa decimal number : 
//AFBC
//Hexadecimal number : AFBC
//Decimal number : 44988
