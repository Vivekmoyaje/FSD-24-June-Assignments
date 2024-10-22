package collection.map_Task;

import java.util.HashMap;

//Write a Java program to copy all of the mappings from the specified map to another map

public class CopyAll3 {

	public static void main(String[] args) {

		HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
		HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();

		hash_map1.put(1, "hyderabad");
		hash_map1.put(2, "mumbai");
		hash_map1.put(3, "goa");
		hash_map1.put(4, "pune");
		hash_map1.put(5, "delhi");

		hash_map2.put(101, "maharashtra");
		hash_map2.put(102, "telangana");
		hash_map2.put(103, "karnataka");
		hash_map2.put(104, "chattisagadh");
		hash_map2.put(105, "odisa");

		System.out.println("Hashmap 1 : " + hash_map1);
		System.out.println("Hashmap 2 : " + hash_map2);

		hash_map2.putAll(hash_map1);

		System.out.println("\nAfter copying Hashmap 1 into Hashmap 2 : ");
		System.out.println("Hashmap 2 : " + hash_map2);

	}

}

//Output : 

//Hashmap 1 : {1=hyderabad, 2=mumbai, 3=goa, 4=pune, 5=delhi}
//Hashmap 2 : {101=maharashtra, 102=telangana, 103=karnataka, 104=chattisagadh, 105=odisa}
//
//After copying Hashmap 1 into Hashmap 2 : 
//Hashmap 2 : {1=hyderabad, 2=mumbai, 3=goa, 4=pune, 101=maharashtra, 5=delhi, 102=telangana, 103=karnataka, 104=chattisagadh, 105=odisa}
