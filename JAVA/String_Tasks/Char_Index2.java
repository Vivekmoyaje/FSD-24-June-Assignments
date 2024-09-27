package String_Tasks;

//Write a program to get the character at the given index within the String

public class Char_Index2 {

	public static void main(String[] args) {

		String name = "Welcome to hyderabad";

		char a = name.charAt(2);
		char b = name.charAt(11);

		System.out.println("The given String is : " + name);
		System.out.println("Character at possition 2 is : " + a);
		System.out.println("Character at possition 11 is : " + b);
	}

}

//Output:

//The given String is : Welcome to hyderabad
//Character at possition 2 is : l
//Character at possition 11 is : h