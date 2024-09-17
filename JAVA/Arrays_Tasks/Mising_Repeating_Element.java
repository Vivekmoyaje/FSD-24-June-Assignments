package Arrays_Tasks;

import java.util.Arrays;

/* Given a read-only array arr of size s, such that each element of the array can not exceed the value s. 
 * Also, in the array, each element occurs only once except a1, which is occurring twice, and therefore, 
 * a2 is missing. Find out the value of a1 and a2. Note that read-only means any modification in the input 
 * array is not allowed.*/

public class Mising_Repeating_Element {

	void findEle(int a[], int s) {

		long nsum = (s * (s + 1)) / 2;

		long nsqrsum = (nsum * (2 * s + 1)) / 3;

		long sqrsum = 0, sum = 0;

		for (int i = 0; i < s; i++) {

			sum = sum + a[i];

			sqrsum = sqrsum + ((long) a[i] * a[i]);
		}

		long sqrdiff = sqrsum - nsqrsum;

		long diff = sum - nsum;

		sum = sqrdiff / diff;

		long a1 = (sum + diff) / 2;

		long a2 = sum - a1;

		System.out.println("For array: " + Arrays.toString(a) + "\n");
		System.out.println("a1 is: " + a1);
		System.out.println("a2 is: " + a2);

		return;
	}

	public static void main(String argvs[]) {

		Mising_Repeating_Element obj = new Mising_Repeating_Element();

		int arr[] = { 1, 3, 5, 4, 1 };
		int size = arr.length;

		obj.findEle(arr, size);

		int arr1[] = { 1, 3, 5, 2, 3 };
		size = arr1.length;

		System.out.println();
		obj.findEle(arr1, size);

	}

}

//Output:

//For array: [1, 3, 5, 4, 1]
//
//a1 is: 1
//a2 is: 2
//
//For array: [1, 3, 5, 2, 3]
//
//a1 is: 3
//a2 is: 4
