package collection.list_Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArraylist4 {

	public static void main(String[] args) {

		List<String> str = new ArrayList<String>();

		str.add("apple");
		str.add("orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");
		str.add("papaya");

		System.out.println("Before sorting : " + str);

		Collections.sort(str);

		System.out.println("After sorting : " + str);
	}

}

//Output : 

//Before sorting : [apple, orange, banana, kiwi, watermalon, pineapple, papaya]
//After sorting : [apple, banana, kiwi, orange, papaya, pineapple, watermalon]