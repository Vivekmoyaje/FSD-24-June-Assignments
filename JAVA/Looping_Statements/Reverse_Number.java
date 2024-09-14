package Looping_Statements;

import java.util.Scanner;

// write a program to print all natural numbers in reverse.

public class Reverse_Number {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the start number : ");
		int sNum = input.nextInt();

		System.out.println("Enter the end number : ");
		int eNum = input.nextInt();

		while (sNum >= eNum) {
			System.out.println(sNum);
			sNum--;
		}
	}

}

// Output:

//Enter the start number : 
//45
//Enter the end number : 
//1
//45
//44
//43
//42
//41
//40
//39
//38
//37
//36
//35
//34
//33
//32
//31
//30
//29
//28
//27
//26
//25
//24
//23
//22
//21
//20
//19
//18
//17
//16
//15
//14
//13
//12
//11
//10
//9
//8
//7
//6
//5
//4
//3
//2
//1

