package collection.map_Task;

import java.util.HashMap;
import java.util.Set;

//Write a Java program to create a set view of the mappings contained in a map

public class CreateSetView9 {

	public static void main(String[] args) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "hyd");
		hash_map.put(2, "mumbai");
		hash_map.put(3, "goa");
		hash_map.put(4, "pune");
		hash_map.put(5, "delhi");

		Set set = hash_map.entrySet();

		System.out.println("Set values : " + set);
	}

}
