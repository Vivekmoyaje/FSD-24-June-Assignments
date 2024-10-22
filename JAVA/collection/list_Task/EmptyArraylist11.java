package collection.list_Task;

import java.util.ArrayList;
import java.util.Collections;

public class EmptyArraylist11 {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();

		str.add("apple");
		str.add("orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");
		str.add("papaya");

		System.out.println("Original arraylist : " + str);

		str.removeAll(str);

		System.out.println("Arraylit after remove all element : " + str);
	}

}

//Output : 

//Original arraylist : [apple, orange, banana, kiwi, watermalon, pineapple, papaya]
//Arraylit after remove all element : []
