package collection.list_Task;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortion16 {

	public static void main(String[] args) {

		List<String> str = new ArrayList<String>();

		str.add("apple");
		str.add("orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");
		str.add("papaya");

		System.out.println("The given list : " + str);

		List<String> subList = new ArrayList<String>();

		subList = str.subList(0, 5);

		System.out.println("List of first five elements are : " + subList);
	}

}

//Output : 

//The given list : [apple, orange, banana, kiwi, watermalon, pineapple, papaya]
//List of first five elements are : [apple, orange, banana, kiwi, watermalon]
