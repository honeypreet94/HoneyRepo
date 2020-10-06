package simple;

public class MatrixSpiral {

	public static void main(String arg[]) {
		int a[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		int r = 3, c = 5;
		printSpiral(a, r, c);

	}

	public static void printSpiral(int a[][],int r,int c) {
		int row = 0, endRow = r, col = 0, endCol = c, i;


		while (row < endRow && col < endCol) {
			for (i = col; i < endCol; i++) {
				System.out.print(a[row][i]);
			}
			row++;
			for (i = row; i < endRow; i++) {
				System.out.print(a[i][endCol - 1]);
			}
			endCol--;

			if (col < endCol && row < endRow) {
				for (i = endCol - 1; i >= col; i--)
					System.out.print(a[endRow - 1][i]);

				endRow--;

				for (i = endRow - 1; i >= row; i--)

					System.out.print(a[i][col]);

				col++;
			}


		}
	}

}
