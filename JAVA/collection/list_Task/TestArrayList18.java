package collection.list_Task;

import java.util.ArrayList;

public class TestArrayList18 {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();

		str.add("apple");
		str.add("orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");
		str.add("papaya");

		System.out.println("Given Array List : " + str);
		System.out.println("Checking the arraylist empty or not : " + str.isEmpty());

		str.removeAll(str);
		System.out.println("After Remove all Elements in Array List : " + str);
		System.out.println("Checking the arrayList empty or not: " + str.isEmpty());
	}
}

//Output : 

//Given Array List : [apple, orange, banana, kiwi, watermalon, pineapple, papaya]
//Checking the arraylist empty or not : false
//After Remove all Elements in Array List : []
//Checking the arrayList empty or not: true
