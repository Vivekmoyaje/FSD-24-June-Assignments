package String_Tasks;

//Write a program to Count words in Given String

public class Count_Words26 {

	public static void main(String[] args) {

		String str = "java developer and python developer";

		String[] words = str.split(" ");

		int count = 1;

		for (int i = 0; i < words.length; i++) {

			for (int j = i + 1; j < words.length; j++) {

				if (words[i].equals(words[j])) {

					count += 1;
					words[j] = "0";
				}

			}

			if (words[i] != "0") {
				System.out.println(words[i] + " = " + count);

			}
			count = 1;
		}

	}

}

//Output:

//java = 1
//developer = 2
//and = 1
//python = 1
