package Conditional_Statement;

import java.util.Scanner;

//Write a program to count total number of notes in given amount

public class Notes_In_Amount {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Amount : ");
		int amount = input.nextInt();

		int n500 = 0;
		int n200 = 0;
		int n100 = 0;
		int n50 = 0;
		int n20 = 0;
		int n10 = 0;
		int n5 = 0;
		int n2 = 0;
		int n1 = 0;

		if (amount >= 500) {
			n500 = amount / 500;
			amount -= n500*500;
		}
		if (amount >= 200) {
			n200 = amount / 200;
			amount -= n200*200;
		}
		if (amount >= 100) {
			n100 = amount / 100;
			amount -= n100*100;
		}
		if (amount >= 50) {
			n50 = amount / 50;
			amount -= n50*50;
		}
		if (amount >= 20) {
			n20 = amount / 20;
			amount -= n20*20;
		}
		if (amount >= 10) {
			n10 = amount / 10;
			amount -= n10*10;
		}
		if (amount >= 5) {
			n5 = amount / 5;
			amount -= n5*5;
		}
		if (amount >= 2) {
			n2 = amount / 2;
			amount -= n2*2;
		}
		if (amount >= 1) {
			n1 = amount / 1;
			amount -= n1*1;
		}

		System.out.println("Notes of 500rs" + " = " + n500);
		System.out.println("Notes of 200rs" + " = " + n200);
		System.out.println("Notes of 100rs" + " = " + n100);
		System.out.println("Notes of 50rs" + " = " + n50);
		System.out.println("Notes of 20rs" + " = " + n20);
		System.out.println("Notes of 10rs" + " = " + n10);
		System.out.println("Coins of 5rs" + " = " + n5);
		System.out.println("Coins of 2rs" + " = " + n2);
		System.out.println("Coins of 1rs" + " = " + n1);

	}

}

//Amount : 

//Enter the Amount : 
//1828
//Notes of 500rs = 3
//Notes of 200rs = 1
//Notes of 100rs = 1
//Notes of 50rs = 0
//Notes of 20rs = 1
//Notes of 10rs = 0
//Coins of 5rs = 1
//Coins of 2rs = 1
//Coins of 1rs = 1

