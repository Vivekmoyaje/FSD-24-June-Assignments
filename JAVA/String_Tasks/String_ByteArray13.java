package String_Tasks;

//Write a program to get the contents of a given string as a byte array

public class String_ByteArray13 {
	
	public static void main(String[] args) {
		
		String str = "Welcome to hyderabad";
		
		byte [] arr = str.getBytes();
		
		String str1 = new String(arr);
		
		System.out.println(str1);
	}
	
}

//Output:

//Welcome to hyderabad
