package collection.map_Task;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Write a Java program to associate the specified value with the specified key in a HashMap

public class SpecifiedValue1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "hyd");
		hash_map.put(2, "mumbai");
		hash_map.put(3, "goa");
		hash_map.put(4, "pune");
		hash_map.put(5, "delhi");

		for (Map.Entry ele : hash_map.entrySet()) {

			System.out.println(ele.getKey() + " " + ele.getValue());
		}

		System.out.println("\nUsing iterator : ");
		Set<Entry<Integer, String>> result = hash_map.entrySet();
		Iterator<Entry<Integer, String>> itr = result.iterator();

		while (itr.hasNext()) {

			Entry<Integer, String> finalresult = itr.next();
			System.out.println(finalresult.getKey() + " " + finalresult.getValue());
		}
	}

}

//Output : 

//1 hyd
//2 mumbai
//3 goa
//4 pune
//5 delhi
//
//Using iterator : 
//1 hyd
//2 mumbai
//3 goa
//4 pune
//5 delhi
