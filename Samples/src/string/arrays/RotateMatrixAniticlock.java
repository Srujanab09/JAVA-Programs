package string.arrays;

public class RotateMatrixAniticlock {

	/*
	 * rotate square matrix anti clock wise 90 degress
	 * 
	 */
	boolean rotateMatrixAnticlock(int matrix[][]){
		if(matrix.length ==0)
			return false;
		
		int m = matrix.length;
		//int n= matrix[0].length;
		
		for(int layer =0; layer < m/2 ; layer++){
			int first = layer;
			int last= m-layer-1;
			for(int i= first; i< last; i++){
				int offset = i - first;
				int top= matrix[first][i];
			
				matrix[first][i] = matrix[i][last];
				matrix[i][last] = matrix[last][last-offset];
				
				matrix[last][last-offset] = matrix[last-offset][first];
				matrix[last-offset][first] = top;
			
			}
			
		}
		
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		        System.out.print(matrix[i][j] + "   ");
		    }
		    System.out.println();
		}
		
		return true;
	}
	
	public static void main(String args[]){
		int a[][] = {{1,2,3,4},{5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < a[i].length; j++) {
		        System.out.print(a[i][j] + "   ");
		    }
		    System.out.println();
		}
		System.out.println("--------------");
		RotateMatrixAniticlock rm = new RotateMatrixAniticlock();
		if(rm.rotateMatrixAnticlock(a))
			System.out.println("rotated");
		else
			System.out.println("not rotated");
	}
}
