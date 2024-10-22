package collection.map_Task;

import java.util.HashMap;

//Write a Java program to get a shallow copy of a HashMap instance

public class ShadowCopy6 {

	public static void main(String[] args) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "hyd");
		hash_map.put(2, "mumbai");
		hash_map.put(3, "goa");
		hash_map.put(4, "pune");
		hash_map.put(5, "delhi");

		System.out.println("Hashmap : " + hash_map);

		HashMap<Integer, String> new_hashMap = (HashMap<Integer, String>) hash_map.clone();

		System.out.println("Clone Hashmap : " + new_hashMap);
	}

}

//Output : 

//Hashmap : {1=hyd, 2=mumbai, 3=goa, 4=pune, 5=delhi}
//Clone Hashmap : {1=hyd, 2=mumbai, 3=goa, 4=pune, 5=delhi}
