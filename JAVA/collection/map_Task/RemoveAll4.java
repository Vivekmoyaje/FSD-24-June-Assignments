package collection.map_Task;

import java.util.HashMap;

//Write a Java program to remove all the mappings from a map

public class RemoveAll4 {

	public static void main(String[] args) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "hyd");
		hash_map.put(2, "mumbai");
		hash_map.put(3, "goa");
		hash_map.put(4, "pune");
		hash_map.put(5, "delhi");

		System.out.println("The original Hashmap : " + hash_map);

		hash_map.clear();

		System.out.println("Hashmap After removing all : " + hash_map);
	}

}

//Output : 

//The original Hashmap : {1=hyd, 2=mumbai, 3=goa, 4=pune, 5=delhi}
//Hashmap After removing all : {}
