package collection.list_Task;

import java.util.ArrayList;
import java.util.List;

public class RemoveFifthElement3 {
	
	public static void main(String[] args) {
		
		List<String> str = new ArrayList<String>();
		
		str.add("apple");
		str.add("orange");
		str.add("banana");
		str.add("kiwi");
		str.add("watermalon");
		str.add("pineapple");
		str.add("papaya");
		
		System.out.println("The original arraylist : " + str);
		
		str.remove(5);
		System.out.println("After removing fifth element : " +str);
	}

}

//Output : 

//The original arraylist : [apple, orange, banana, kiwi, watermalon, pineapple, papaya]
//After removing fifth element : [apple, orange, banana, kiwi, watermalon, papaya]
