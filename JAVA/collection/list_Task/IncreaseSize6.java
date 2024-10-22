package collection.list_Task;

import java.util.ArrayList;
import java.util.List;

public class IncreaseSize6 {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>(5);

		str.add("apple");
		str.add("orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");

		System.out.println("Original arraylist : " + str);

		str.ensureCapacity(7);

		str.add("pineapple");
		str.add("papaya");

		System.out.println("New after increasing arraylist : " + str);

	}

}
