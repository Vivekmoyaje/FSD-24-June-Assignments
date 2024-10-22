package collection.list_Task;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArraylist9 {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();

		str.add("apple");
		str.add("orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");
		str.add("papaya");

		System.out.println("Arraylist before swap : " + str);

		Collections.swap(str, 1, 5);
		System.out.println("Arraylist after swaping : " + str);

	}

}

//Output : 

//Arraylist before swap : [apple, orange, banana, kiwi, watermalon, pineapple, papaya]
//Arraylist after swaping : [apple, pineapple, banana, kiwi, watermalon, orange, papaya]