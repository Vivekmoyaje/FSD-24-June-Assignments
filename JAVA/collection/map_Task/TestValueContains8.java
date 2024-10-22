package collection.map_Task;

import java.util.HashMap;

//Write a Java program to test if a map contains a mapping for the specified value

public class TestValueContains8 {

	public static void main(String[] args) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "hyd");
		hash_map.put(2, "mumbai");
		hash_map.put(3, "goa");
		hash_map.put(4, "pune");
		hash_map.put(5, "delhi");

		System.out.println("Hashmap : " + hash_map);

		System.out.println("\nIs any value \'pune\' exist ? ");

		if (hash_map.containsValue("pune")) {
			System.out.println("yes the value exist ");
		} else {
			System.out.println("Does not exist");
		}
	}

}

//Output : 

//Hashmap : {1=hyd, 2=mumbai, 3=goa, 4=pune, 5=delhi}
//
//Is any value 'pune' exist ? 
//yes the value exist 
