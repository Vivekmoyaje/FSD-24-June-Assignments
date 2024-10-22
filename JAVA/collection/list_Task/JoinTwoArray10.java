package collection.list_Task;

import java.util.ArrayList;
import java.util.Collections;

public class JoinTwoArray10 {

	public static void main(String[] args) {

		ArrayList<String> str1 = new ArrayList<String>();

		str1.add("one");
		str1.add("two");
		str1.add("three");
		str1.add("four");

		System.out.println("First Arraylist : " + str1);

		ArrayList<String> str2 = new ArrayList<String>();

		str2.add("five");
		str2.add("six");
		str2.add("seven");
		str2.add("eight");

		System.out.println("Second Arraylist : " + str2);

		ArrayList<String> str3 = new ArrayList<String>();

		str3.addAll(str1);
		str3.addAll(str2);

		System.out.println("Join two Array List is : " + str3);

	}

}
