package Arrays_Tasks;

//write a java program sort the elements of an array in ascending order

public class Descending2 {
	
	public static void main(String[] args) {
		
		System.out.println("Original Array elements are : ");
		
		int arr [] = {4,7,9,5,6,12,3};
		
		int temp = 0;
		
		for(int orig:arr) {
			
			System.out.print(orig +" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("\n\n The sorted array in descending order is : ");
		
		for(int sort:arr) {
			
			System.out.print(sort + " ");
		}
		
		
	}

}

//Output:

//Original Array elements are : 
//4 7 9 5 6 12 3 
//
// The sorted array in descending order is : 
//12 9 7 6 5 4 3 
