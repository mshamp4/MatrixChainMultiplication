package multiplication;

public class Matrix {

	public int matrixChainMultiplication(int matrix[], int start, int end) {

		if (start == end)
			return 0;

		int min = Integer.MAX_VALUE;

		for (int i = start; i < end; i++) {
			int count = matrixChainMultiplication(matrix, start, i) + 
						matrixChainMultiplication(matrix, i + 1, end) + 
						matrix[start - 1] * matrix[i] * matrix[end];

			if (count < min) {
				min = count;
				System.out.println(i);
				System.out.println(start);
				System.out.println(end);
			}
		}

		return min;
	}

	public boolean multiplyCheck(int row, int col) {
		return (row == col);
	}
}
