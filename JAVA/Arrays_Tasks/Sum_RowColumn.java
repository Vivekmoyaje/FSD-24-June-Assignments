package Arrays_Tasks;

//write a java program the sum of each row and each column of a matrix

public class Sum_RowColumn {

	public static void main(String[] args) {

		int arr[][] = { { 2, 4, 6 }, { 3, 5, 7 }, { 8, 2, 9 } };

		int rows = arr.length;
		int cols = arr[0].length;

		for (int i = 0; i < rows; i++) {
			int rowSum = 0;

			for (int j = 0; j < cols; j++) {
				rowSum += arr[i][j];

			}
			System.out.println("Sum of " + (i + 1) + " row is = " + rowSum);

		}

		for (int i = 0; i < cols; i++) {
			int colSum = 0;

			for (int j = 0; j < rows; j++) {
				colSum += arr[j][i];

			}
			
			System.out.println("Sum of " + (i + 1) + " column is = " + colSum);
		}

	}

}

//Output:

//Sum of 1 row is = 12
//Sum of 2 row is = 15
//Sum of 3 row is = 19
//Sum of 1 column is = 13
//Sum of 2 column is = 11
//Sum of 3 column is = 22
