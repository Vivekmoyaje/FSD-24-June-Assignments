package Arrays_Tasks;

//write a java program add two matrices

public class AddItion_Matrics {

	public static void main(String[] args) {

		int arr1[][] = { { 1, 4, 6, 8 }, { 4, 7, 2, 6 }, { 3, 7, 4, 6 }, { 3, 6, 3, 7 } };
		int arr2[][] = { { 3, 6, 3, 5 }, { 2, 5, 3, 5 }, { 2, 3, 4, 7 }, { 1, 5, 3, 4 } };

		int addArr[][] = new int[4][4];

		System.out.println("The addition array is : ");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				addArr[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(addArr[i][j] + " ");
			}
			System.out.println();
		}
	}

}

//Output:

//The addition array is : 
//4 10 9 13 
//6 12 5 11 
//5 10 8 13 
//4 11 6 11 