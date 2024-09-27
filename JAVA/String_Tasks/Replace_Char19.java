package String_Tasks;

//Write a program to replace a specified character with another character

public class Replace_Char19 {
	
	public static void main(String[] args) {
		
		String str = "Hello world";
		
		String demo = str.replace('l', 'A');
		
		System.out.println("Original string is : " +str);
		System.out.println("string after replace l to A : " +demo);
	}
	
}

//Output:

//Original string is : Hello world
//string after replace l to A : HeAAo worAd