package Conditional_Statement;

import java.util.Scanner;

/*
 * Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
 * */

public class Student_Grade {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter The Five Subject Marks :");
		System.out.print("Physics:");
		int phy = input.nextInt();
		System.out.print("Math:");
		int math = input.nextInt();
		System.out.print("Biology:");
		int bio = input.nextInt();
		System.out.print("Chemistry:");
		int che = input.nextInt();
		System.out.print("English:");
		int eng = input.nextInt();
		int total = phy + math + bio + che + eng;
		float per = total / 5;
		
		System.out.println("Total marks is : " + total);
		System.out.println("Total Percentage is : " + per);
		
		if (per >= 90)
			System.out.println("Grade A");
		else if (per >= 80)
			System.out.println("Grade B");
		else if (per >= 70)
			System.out.println("Grade C");
		else if (per >= 60)
			System.out.println("Grade D");
		else if (per >= 40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}

}

//Output:

//Enter The Five Subject Marks :
//Physics:76
//Math:90
//Biology:78
//Chemistry:67
//English:75
//Total marks is : 386
// Total Percentage is : 77.0
//Grade C
