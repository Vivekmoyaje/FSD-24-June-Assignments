package collection.list_Task;

import java.util.ArrayList;
import java.util.List;

public class RetrieveElement12 {

	public static void main(String[] args) {

		List<String> str = new ArrayList<String>();

		str.add("apple");
		str.add("orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");
		str.add("papaya");

		System.out.println(str);

		String element = str.get(1);

		System.out.println("Second element : " + element);

		element = str.get(5);

		System.out.println("Sixth element : " + element);
	}

}

// Output : 

//[apple, orange, banana, kiwi, watermalon, pineapple, papaya]
//Second element : orange
//Sixth element : pineapple
