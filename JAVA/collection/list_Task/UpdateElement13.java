package collection.list_Task;

import java.util.ArrayList;
import java.util.List;

public class UpdateElement13 {

	public static void main(String[] args) {

		List<String> str = new ArrayList<String>();

		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");
		str.add("papaya");

		System.out.println("Original arraylist : " + str);

		str.set(0, "Tomato");
		str.set(3, "batata");

		System.out.println("After updating element : " + str);

	}

}

//Output : 

//Original arraylist : [banana, kiwi, watermalon, pineapple, papaya]
//After updating element : [Tomato, kiwi, watermalon, batata, papaya]