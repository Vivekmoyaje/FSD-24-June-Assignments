package JAVA_Test;

//14.Write a program to count a number of Unicode code points in the specified 
//text range of a String

public class Que14 {

	public static void main(String[] args) {

		String str = "Java developer";

		int count = str.codePointCount(0, 7);

		System.out.println(count);
	}

}
//Output:

// 7