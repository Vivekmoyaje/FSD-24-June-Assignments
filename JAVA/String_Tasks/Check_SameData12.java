package String_Tasks;

//Write a program to check whether two String objects contain the same data

public class Check_SameData12 {

	public static void main(String[] args) {

		String str = "Hello world";
		String str1 = "Good morning";
		String str2 = "Hello world";

		boolean equal1 = str.equals(str1);
		boolean equal2 = str.equals(str2);

		System.out.println(str + " is equal to " + str1 + " : " + equal1);
		System.out.println(str + " is equal to " + str2 + " : " + equal2);

	}

}

//Output:

//Hello world is equal to Good morning : false
//Hello world is equal to Hello world : true
