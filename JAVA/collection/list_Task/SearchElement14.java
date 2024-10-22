package collection.list_Task;

import java.util.ArrayList;
import java.util.List;

public class SearchElement14 {

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
		
		String s = "kiwi";

		if (str.contains(s)) {
			System.out.println(s +" element found in the arraylist ");
		} else {
			System.out.println(s +" element not found in the arraylist ");
		}

	}

}

//Output : 

//[apple, orange, banana, kiwi, watermalon, pineapple, papaya]
//kiwi element found in the arraylist 
