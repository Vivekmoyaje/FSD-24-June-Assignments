package String_Tasks;

//Write a program to check whether a given string ends with the contents of another string.

public class Check_EndWith11 {
	
	public static void main(String[] args) {
		
		String str = "Java Developer";
		String str1 = "React Developers";
		
		String end = "er";
		
		System.out.println(str +" end with " +end +" : " +str.endsWith(end));
		System.out.println(str1 +" end with " +end +" : " +str1.endsWith(end));
	}

}

//Output:

//Java Developer end with er : true
//React Developers end with er : false