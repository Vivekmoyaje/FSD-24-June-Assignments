package collection.map_Task;

import java.util.HashMap;

//Write a Java program to count the number of key-value (size) mappings in a map

public class CountNum_KeyValue2 {

	public static void main(String[] args) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "hyd");
		hash_map.put(2, "mumbai");
		hash_map.put(3, "goa");
		hash_map.put(4, "pune");
		hash_map.put(5, "delhi");

		System.out.println("The number of key value in hashmap is : " + hash_map.size());
	}

}

//Output : 

//The number of key value in hashmap is : 5
