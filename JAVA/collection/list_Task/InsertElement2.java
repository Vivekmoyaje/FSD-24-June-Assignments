package collection.list_Task;

import java.util.ArrayList;
import java.util.List;

public class InsertElement2 {

	public static void main(String[] args) {

		List<String> str = new ArrayList<String>();

		str.add("apple");
		str.add("orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");

		System.out.println("Before inserting element : " + str);

		str.add(0, "papaya");

		System.out.println("After inserting element : " + str);
	}

}

//Output :

//Before inserting element : [apple, orange, banana, kiwi, watermalon, pineapple]
//After inserting element : [papaya, apple, orange, banana, kiwi, watermalon, pineapple]