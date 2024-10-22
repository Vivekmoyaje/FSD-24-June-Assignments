package collection.list_Task;

import java.util.ArrayList;
import java.util.List;

public class CapacityArraylist19 {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();

		str.add("apple");
		str.add("     orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");
		str.add("papaya");

		System.out.println("The original Arraylist : " + str);

		str.trimToSize();

		System.out.println("After trim the size of the Arraylist : " + str);
	}

}
