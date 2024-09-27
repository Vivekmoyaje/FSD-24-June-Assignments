package String_Tasks;

//Write a program to test if a given string contains the specified sequence of char values

public class String_Contains8 {
	
	public static void main(String[] args) {
		
		String str = "Welcome to Hyderabad";
		
		String str1 = "Hyd";
		String str2 = "Hello";
		
		System.out.println("String 1 : " +str);
		
		System.out.println(str1 +" is present in String 1 : " +str.contains(str1));
		System.out.println(str2 +" is present in String 1 : " +str.contains(str2));
	}

}

//Output:

//String 1 : Welcome to Hyderabad
//Hyd is present in String 1 : true
//Hello is present in String 1 : false