package string.arrays;

public class ZeroMatrixSpaceEfficiency {

	void zeroMatrix(int matrix[][]){
		boolean rowflag = false;
		boolean columnflag = false;
		
		for(int j=0; j<matrix[0].length; j++){
			if(matrix[0][j]==0){
				rowflag = true;
				break;
			}
		}
		
		for(int i=0; i<matrix.length; i++){
			if(matrix[i][0]==0){
				columnflag = true;
				break;
			}
		}
		
		for(int i=1; i< matrix.length;i++){
			for(int j=1; j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					matrix[0][j]=0;
					matrix[i][0]=0;				
				}
			}
		}
		
		for(int i=1; i<matrix.length; i++){
			if(matrix[i][0]==0){
				nullifyRows(matrix, i);
			}
		}
		
		for(int j=1; j<matrix[0].length;j++){
			if(matrix[0][j]==0){
				nullifyColumns(matrix, j);
			}
		}
		
		if(rowflag)
			nullifyRows(matrix, 0);
		if(columnflag)
			nullifyColumns(matrix,0);
	
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+ "  ");
			}
			System.out.println(" ");
		}
	}
	
	void nullifyRows(int matrix[][], int row){
		for(int j=0; j< matrix[0].length; j++){
			matrix[row][j]=0;
		}
	}
	
	void nullifyColumns(int matrix[][], int column){
		for(int i=0; i<matrix.length;i++){
			matrix[i][column] = 0;
		}
	}
	
	public static void main(String args[]){
		int matrix[][] = {{1,0,11}, {4,1,6}, {7,0,9}, {9,9,12}, {1,1,1}};
		ZeroMatrixSpaceEfficiency zm = new ZeroMatrixSpaceEfficiency();
		
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+ "  ");
			}
			System.out.println(" ");
		}
		System.out.println("-----------------");
		
		zm.zeroMatrix(matrix);
		
	}
	
}
