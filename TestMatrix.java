package multiplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMatrix {

	public static void main(String[] args) {

		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader bufReader = new BufferedReader(isReader);

		try {
//			int[] matrixArr = {5, 1, 2, 3, 4, 5};
//			int[] arr = {1, 2, 3, 4};
			String input = bufReader.readLine();
			int[] arr = new int[Integer.parseInt(input)];
			int count = 0;
			input = bufReader.readLine();

			while (input != null) {
				arr[count++] = Integer.parseInt(input);
				input = bufReader.readLine();
			}
			
			
			Matrix a = new Matrix();
			int min = a.matrixChainMultiplication(arr, 1, (arr.length-1));
			System.out.println("Minimum number of multiplications " + min);

		} catch (IOException e) {
			System.out.println("An error has occured!");
			System.exit(0);

		} catch (NumberFormatException e) {
			System.out.println("File must contain only integers!");
		}
	}
}
