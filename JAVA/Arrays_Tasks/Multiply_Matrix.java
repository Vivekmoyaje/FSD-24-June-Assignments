package Arrays_Tasks;

public class Multiply_Matrix {

	public static void main(String[] args) {

		int A[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int B[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

		int rowA = A.length;
		int colA = A[0].length;
		int rowB = B.length;
		int colB = B[0].length;

		int Mul[][] = new int[rowA][colB];

		for (int i = 0; i < rowA; i++) {

			for (int j = 0; j < colB; j++) {

				Mul[i][j] = 0;

				for (int k = 0; k < rowB; k++) {

					Mul[i][j] += A[i][k] * B[k][j];
				}

				System.out.print(Mul[i][j] + " ");
			}

			System.out.println();
		}

	}

}
