package String_Tasks;

//Write a program to check whether a given string starts with the contents of another string

public class Check_StartWith21 {

	public static void main(String[] args) {

		String str1 = "delhi is a capital of india";
		String str2 = "mumbai is a capital of maharashtra";

		String check = "delhi";

		boolean start1 = str1.startsWith(check);
		boolean start2 = str2.startsWith(check);

		System.out.println(str1 + " start with " + check + " : " + start1);
		System.out.println(str2 + " start with " + check + " : " + start2);
	}

}

//Output:

//delhi is a capital of india start with delhi : true
//mumbai is a capital of maharashtra start with delhi : false
