package Polymorphism_Coding_Questions;

public class Que1 {

	public static void main(String[] args) {

		System.out.println("Hi");
		main("Hello world");
		main("Tom", "Jerry");

	}

	public static void main(String str1) {

		System.out.println("Overloaded : " + str1);

	}

	public static void main(String str1, String str2) {

		System.out.println("Overloaded : " + str1 + " & " + str2);

	}

}

//Output;

//Hi
//Overloaded : Hello world
//Overloaded : Tom & Jerry
