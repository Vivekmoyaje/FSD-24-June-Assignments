package collection.list_Task;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create a new array list, add some elements and print out the collection

public class AddElements1 {
	
	public static void main(String[] args) {
		
		List<String> str = new ArrayList<String>();
		
		str.add("apple");
		str.add("orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");
		
		System.out.println(str);
	}

}

//Output : 

//[apple, orange, banana, kiwi, watermalon, pineapple]
