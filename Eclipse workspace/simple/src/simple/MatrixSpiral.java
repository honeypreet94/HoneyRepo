package simple;

public class MatrixSpiral {
	
	public static void main(String arg[])
	{
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int r=4,c=3;
		printSpiral(a,r,c);
	}
	public static void printSpiral(int a[][],int r,int c)
	{
		int row=0,endRow=r,col=0,endCol=c,i;
		
		
		while(row<endRow && col<endCol)
		{
			for(i=row;i<endRow;i++)
			{
				System.out.print(a[row][i]);
			}
			row++;
			for(i=row;i<endCol;i++)
			{
				System.out.print(a[i][endCol]);
			}
			endCol--;
			if(col<endCol)
			{
				for(i=endCol-1;i>=col;i--)
					System.out.print(a[endRow-1][i]);
				
				endRow--;
			}
			if(row<endRow)
			{
				for(i=endRow-1;i>col;i--)
					System.out.print(a[i][col]);
				
				col++;
			}
		}
		
	}

}
