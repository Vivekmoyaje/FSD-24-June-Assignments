package collection.list_Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArraylist7 {

	public static void main(String[] args) {

		List<String> str = new ArrayList<String>();

		str.add("apple");
		str.add("orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");
		str.add("papaya");

		System.out.println("Original arraylist : " + str);

		Collections.reverse(str);

		System.out.println("Reversed arraylist : " + str);
	}

}

//Output : 

//Original arraylist : [apple, orange, banana, kiwi, watermalon, pineapple, papaya]
//Reversed arraylist : [papaya, pineapple, watermalon, kiwi, banana, orange, apple]
