package collection.list_Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArraylist5 {

	public static void main(String[] args) {

		List<String> str = new ArrayList<String>();

		str.add("apple");
		str.add("orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");
		str.add("papaya");

		System.out.println("Before shuffling : " + str);

		Collections.shuffle(str);

		System.out.println("After shuffling : " + str);
	}

}

//Output : 

//Before shuffling : [apple, orange, banana, kiwi, watermalon, pineapple, papaya]
//After shuffling : [papaya, apple, pineapple, orange, watermalon, kiwi, banana]
