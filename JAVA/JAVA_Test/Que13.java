package JAVA_Test;

//13.Write a program to check whether two String objects contain the same data

public class Que13 {

	public static void main(String[] args) {

		String str = "Java developer";
		String str1 = "Java developer";
		
		if(str.contains(str1)) {
			System.out.println("The string1 and string2 have same data");
		}
		else {
			System.out.println("The string1 and string2 have different data");
		}

	}

}

//Output:

//The string1 and string2 have same data
