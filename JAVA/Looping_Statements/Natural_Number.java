package Looping_Statements;

import java.util.Scanner;

// write a program to print all natural numbers from 0 to n.
public class Natural_Number {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the starting number : ");
		int sNum = input.nextInt();

		System.out.println("Enter the end number : ");
		int eNum = input.nextInt();

		while (sNum <= eNum) {
			System.out.println(sNum);
			sNum++;
		}
	}

}

// Output : 

//Enter the starting number : 
//2
//Enter the end number : 
//55
//2
//3
//4
//5
//6
//7
//8
//9
//10
//11
//12
//13
//14
//15
//16
//17
//18
//19
//20
//21
//22
//23
//24
//25
//26
//27
//28
//29
//30
//31
//32
//33
//34
//35
//36
//37
//38
//39
//40
//41
//42
//43
//44
//45
//46
//47
//48
//49
//50
//51
//52
//53
//54
//55
