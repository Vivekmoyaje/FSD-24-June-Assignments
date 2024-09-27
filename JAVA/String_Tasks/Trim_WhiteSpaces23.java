package String_Tasks;

//Write a program to trim any leading or trailing whitespace from a given string

public class Trim_WhiteSpaces23 {
	
	public static void main(String[] args) {
		
		String str = "      Developer     ";
		
		String demo = str.trim();
		
		System.out.println("The original string is : " +str);
		System.out.println("The string after trim is : " +demo);
	}

}

//Output:

//The original string is :       Developer     
//The string after trim is : Developer
