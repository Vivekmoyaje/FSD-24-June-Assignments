package String_Tasks;

//Write a program to count a number of Unicode code points in the specified text range of a String.

public class CodePoint_Count4 {
	
	public static void main(String[] args) {
		
		String str = "Welcome to Hyderabad";
		
	     int a = str.codePointCount(2, 14);
	     
	     System.out.println("The given String is : " +str);
	     System.out.println("codepoint count : " +a);
	}

}

//Output :

//The given String is : Welcome to Hyderabad
//codepoint count : 12
