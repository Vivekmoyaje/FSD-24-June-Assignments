package collection.list_Task;

import java.util.ArrayList;

public class CompareTwoArray8 {

	public static void main(String[] args) {

		ArrayList<String> str1 = new ArrayList<String>();

		str1.add("apple");
		str1.add("orange");
		str1.add("banana");
		str1.add("kiwi");

		ArrayList<String> str2 = new ArrayList<String>();

		str2.add("watermalon");
		str2.add("orange");
		str2.add("apple");

		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2);

		ArrayList<String> str3 = new ArrayList<String>();

		for (String e : str1) {

			str3.add(str2.contains(e) ? "True" : "False");

			System.out.println("Compare string 1 and string 2 : " + str3);
		}

	}

}
