package collection.list_Task;

import java.util.ArrayList;

public class CloneArraylist17 {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();

		str.add("apple");
		str.add("orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");
		str.add("papaya");

		System.out.println("Given arraylist : " + str);

		ArrayList<String> clone = (ArrayList<String>) str.clone();

		System.out.println("Clone arraylist is : " + clone);

	}

}

//Output : 

//Given arraylist : [apple, orange, banana, kiwi, watermalon, pineapple, papaya]
//Clone arraylist is : [apple, orange, banana, kiwi, watermalon, pineapple, papaya]