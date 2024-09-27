package String_Tasks;

//Write a program to compare two strings lexicographically , ignoring case differences

public class Comparing_IgnorCase6 {
	
	public static void main(String[] args) {

		String str = "Hello World";
		String str1 = "hello world";

		int isEqual = str.compareToIgnoreCase(str1);
		
		System.out.println("After Comparing two string value is : " +isEqual);

		if (isEqual < 0) {
			System.out.println(str +" is less than " +str1);
		}
		else if(isEqual == 0) {
			System.out.println(str + " is equal to "+str1);
		}
		else {
			System.out.println(str +" is greater than " +str1);
		}
	}

}

//Output:

//After Comparing two string value is : 0
//Hello World is equal to hello world
