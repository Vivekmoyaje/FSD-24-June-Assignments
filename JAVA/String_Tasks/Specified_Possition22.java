package String_Tasks;

//Write a program to get a substring of a given string between two specified positions

public class Specified_Possition22 {

	public static void main(String[] args) {

		String str = "I am java developer";

		String sub = str.substring(5, 9);

		System.out.println("The given string : " + str);
		System.out.println("The substring is : " + sub);
	}

}

//Output:

//The given string : I am java developer
//The substring is : java
