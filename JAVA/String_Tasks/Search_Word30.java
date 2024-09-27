package String_Tasks;

//Write a program How to search a word inside a string?

public class Search_Word30 {

	public static void main(String[] args) {

		String str = "Java is a most popular language in the world";

		int find = str.indexOf("language");

		if (find == -1) {
			System.out.println("language not found");
		}

		else {
			System.out.println("language found at index : " + find);
		}
	}

}

//Output:

//language found at index : 23
