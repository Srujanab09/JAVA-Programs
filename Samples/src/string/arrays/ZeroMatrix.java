package string.arrays;

public class ZeroMatrix {

	void setZeros(int matrix[][]){
		boolean row[] = new boolean[matrix.length];
		boolean column[] = new boolean[matrix[0].length];
		for(int i=0; i< matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if(matrix[i][j]==0){
					row[i]=true;
					column[j]= true;
				}
			}
		}
		
		for(int i=0; i< row.length; i++){
			if(row[i])
				nullifyRows(matrix, i);
			
		}
		for(int j=0; j< column.length; j++){
			if(column[j])
				nullifyColumns(matrix, j);
			
		}
		
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+ "  ");
			}
			System.out.println();
		}
		
	}
	void nullifyRows(int matrix[][],int row){
		for(int j=0; j<matrix[0].length; j++){
			matrix[row][j] = 0;
		}
	}
	
	void nullifyColumns(int matrix[][], int column){
		for(int i=0; i<matrix.length; i++){
			matrix[i][column] =0;
		}
	}
	
	public static void main(String args[]){
		int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}, {0,11,12}, {13,14,0}};
		ZeroMatrix zm = new ZeroMatrix();
		
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+ "  ");
			}
			System.out.println(" ");
		}
		System.out.println("-----------------");
		
		zm.setZeros(matrix);
		
	}
	
}
