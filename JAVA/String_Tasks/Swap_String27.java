package String_Tasks;

//Write a program to Swap Two Strings

public class Swap_String27 {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Python";

		System.out.println("String 1 before swaping : " + str1);
		System.out.println("String 2 before swaping : " + str2 + "\n");

		String temp;

		temp = str1;
		str1 = str2;
		str2 = temp;

		System.out.println("String 1 after swaping : " + str1);
		System.out.println("String 2 after swaping : " + str2);

	}

}

//Output:

//String 1 before swaping : Java
//String 2 before swaping : Python
//
//String 1 after swaping : Python
//String 2 after swaping : Java
