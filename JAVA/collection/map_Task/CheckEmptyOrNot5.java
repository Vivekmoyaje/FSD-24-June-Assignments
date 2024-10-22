package collection.map_Task;

import java.util.HashMap;

//Write a Java program to check whether a map contains key-value mappings (empty) or not

public class CheckEmptyOrNot5 {

	public static void main(String[] args) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "hyd");
		hash_map.put(2, "mumbai");
		hash_map.put(3, "goa");
		hash_map.put(4, "pune");
		hash_map.put(5, "delhi");

		boolean result = hash_map.isEmpty();

		System.out.println("Hashmap : " + hash_map);
		System.out.println("Hashmap is empty : " + result);

		hash_map.clear();

		result = hash_map.isEmpty();

		System.out.println("Hashmap : " + hash_map);
		System.out.println("Hashmap is empty : " + result);

	}

}

//Output : 

//Hashmap : {1=hyd, 2=mumbai, 3=goa, 4=pune, 5=delhi}
//Hashmap is empty : false
//Hashmap : {}
//Hashmap is empty : true
