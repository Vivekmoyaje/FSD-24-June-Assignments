package String_Tasks;

//Write a program to replace each substring of a given string.

public class Replace_SubString20 {

	public static void main(String[] args) {

		String str = "I am python developer";

		String java = str.replace("python", "java");

		System.out.println("original string : " + str);
		System.out.println("After replacing python to java : " + java);
	}

}

//Output:

//original string : I am python developer
//After replacing python to java : I am java developer
