package Project_1;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);

		System.out.println("Enter students name : ");
		String Name = SC.nextLine();

		System.out.println("Enter student age : ");
		int Age = SC.nextInt();

		System.out.println("Enter grade for math : ");
		double Math = SC.nextDouble();

		System.out.println("Enter grade for Science : ");
		double Science = SC.nextDouble();

		System.out.println("Enter grade for English : ");
		double English = SC.nextDouble();

		double Average = (Math + Science + English) / 3;

		String Grade;

		if (Average >= 70) {
			Grade = "First Class";
		} else if (Average >= 50) {
			Grade = "Second Class";
		}

		else if (Average > 40) {
			Grade = "Pass";
		} else {
			Grade = "Fail";
		}

		System.out.println("Student Name : " + Name);
		System.out.println("Age : " + Age);
		System.out.println("Math Grade : " + Math);
		System.out.println("Science Grade : " + Science);
		System.out.println("English Grade : " + English);
		System.out.println("Average Grade : " + Average);
		System.out.println("Grade Classification : " + Grade);
	}
}
