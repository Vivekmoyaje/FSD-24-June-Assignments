package collection.list_Task;

import java.util.ArrayList;

public class PrintElementArraylist20 {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();

		str.add("apple");
		str.add("orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");
		str.add("papaya");

		System.out.println("Given Arraylist : " + str);

		System.out.println("\nprint using index of element : ");

		int length = str.size();

		for (int i = 0; i < length; i++) {
			System.out.println(str.get(i));
		}

//		System.out.println("\nPrint using for of loop");
//
//		for (String ele : str) {
//
//			System.out.println(ele);
//		}
	}

}

//Output : 

//Given Arraylist : [apple, orange, banana, kiwi, watermalon, pineapple, papaya]
//
//print using index of element : 
//apple
//orange
//banana
//kiwi
//watermalon
//pineapple
//papaya
