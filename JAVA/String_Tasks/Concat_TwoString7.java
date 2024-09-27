package String_Tasks;

//Write a program to concatenate a given string to the end of another string

public class Concat_TwoString7 {

	public static void main(String[] args) {

		String str1 = "Hello world";
		String str2 = "Welcome to hyderabad";

		String str3 = str1.concat(str2);

		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2);

		System.out.println("Concate String is : " + str3);
	}

}

//Output;

//String 1 : Hello world
//String 2 : Welcome to hyderabad
//Concate String is : Hello worldWelcome to hyderabad