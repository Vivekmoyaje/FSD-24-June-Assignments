package Arrays_Tasks;

//write a java program print the elements of an array present on even position

public class Print_Even_possition {
	
	public static void main(String[] args) {
		
		int arr [] = {2,7,9,3,6,5,1,5,8};
		
		System.out.println("The numbers present on even possition is : ");
		
		for(int i=1;i<arr.length;i+=2) {
			
			System.out.println(arr[i]);
		}
	}

}

//Output:

//The numbers present on even possition is : 
//7
//3
//5
//5

