/**
 * Write a complete multi-threaded program to meet following requirements:
a. Read matrix [A] m x n
b. Create m number of threads
c. Each thread computes summation of elements of one row, i.e. ith row of the matrix
is processed by ith thread. Where 0 <= i< m.
d. Print the results
 */


public class Lab13C6 {

	static class RowSumThread extends Thread {
		private final int[] row;
		private long sum;

		RowSumThread(int[] row) {
			this.row = row;
		}

		
		public void run() {
			for (int value : row) {
				sum += value;
			}
		}

		long getSum() {
			return sum;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		java.util.Scanner input = new java.util.Scanner(System.in);

		int m = input.nextInt();
		int n = input.nextInt();
		int[][] matrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		RowSumThread[] threads = new RowSumThread[m];
		for (int i = 0; i < m; i++) {
			threads[i] = new RowSumThread(matrix[i]);
			threads[i].start();
		}

		for (int i = 0; i < m; i++) {
			threads[i].join();
			System.out.println("Sum of row " + (i + 1) + ": " + threads[i].getSum());
		}

		input.close();
	}
}
