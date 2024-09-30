package JAVA_Test;

//19.Write a program to find maximum between two string

public class Que19 {

	public static void main(String[] args) {

		String str1 = "java Developer";
		String str2 = "Python Developer";

		int l1 = str1.length();
		int l2 = str2.length();

		if (l1 > l2) {
			System.out.println("The max string is : " + str1);
		} else {
			System.out.println("The max string is : " + str2);
		}
	}
}

//Output

//The max string is : Python Developer