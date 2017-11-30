package string.arrays;

public class RoateRectangularMatrix {

	/*
	 * rectangular matrix anticlock wise rotation
	 * 
	 */
	static int[][] RotateMatrixCounterClockwise(int[][] oldMatrix)
	{
	 
						
		int[][] newMatrix = new int[oldMatrix[0].length] [oldMatrix.length];
	    int newColumn, newRow = 0;
	    for (int oldColumn = oldMatrix[0].length - 1; oldColumn >= 0; oldColumn--)
	    {
	        newColumn = 0;
	        for (int oldRow = 0; oldRow < oldMatrix.length; oldRow++)
	        {
	            newMatrix[newRow] [newColumn] = oldMatrix[oldRow][oldColumn];
	            newColumn++;
	        }
	        newRow++;
	    }
	    
	   
	    
	    for (int i = 0; i < newMatrix.length; i++) {
		    for (int j = 0; j < newMatrix[i].length; j++) {
		        System.out.print(newMatrix[i][j] + "   ");
		    }
		    System.out.println();
		}
	    
	    return newMatrix;
	}
	
	public static void main(String args[]){
		int a[][] = {{1,2,3,4,5},{5,6,7,8,6}, {9,10,11,12,13}, {13,14,15,16,12}};
		for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < a[i].length; j++) {
		        System.out.print(a[i][j] + "   ");
		    }
		    System.out.println();
		}
		System.out.println("--------------");
		RoateRectangularMatrix rm = new RoateRectangularMatrix();
		int aa[][] = rm.RotateMatrixCounterClockwise(a);
			System.out.println("rotated");
	
	}
	
}
