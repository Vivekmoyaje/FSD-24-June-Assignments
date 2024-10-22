package collection.list_Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArraylist15 {

	public static void main(String[] args) {

		List<String> str1 = new ArrayList<String>();

		str1.add("A");
		str1.add("B");
		str1.add("C");
		str1.add("D");
		str1.add("E");

		List<String> str2 = new ArrayList<String>();

		str2.add("1");
		str2.add("2");
		str2.add("3");
		str2.add("4");
		str2.add("5");

		System.out.println("List 1 : " + str1);
		System.out.println("List 2 : " + str2);

		Collections.copy(str1, str2);

		System.out.println("After copy List 1 to List 2 : ");

		System.out.println("List 1 : " + str1);
		System.out.println("List 2 : " + str2);

	}

}

//Output :

//List 1 : [A, B, C, D, E]
//List 2 : [1, 2, 3, 4, 5]
//After copy List 1 to List 2 : 
//List 1 : [1, 2, 3, 4, 5]
//List 2 : [1, 2, 3, 4, 5]
