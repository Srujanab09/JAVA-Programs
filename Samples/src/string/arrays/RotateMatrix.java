package string.arrays;

public class RotateMatrix {

	/*
	 *  Clock wise - by 90 degrees
	 *  
	 */
	boolean rotateMatrixclock(int Matrix[][]){
		if(Matrix.length ==0 || Matrix.length != Matrix[0].length)
			return false;
		
		int n= Matrix.length;
		for(int layer=0; layer< n/2 ; layer++){
			int first = layer;
			int last = n-layer-1;
			for(int i=first; i<last; i++){
				int offset = i - first;
				int top = Matrix[first][i];
				
				Matrix[first][i] = Matrix[last-offset][first];
				
				Matrix[last-offset][first] = Matrix[last][last-offset];
				
				Matrix[last][last-offset] = Matrix[i][last];
				
				Matrix[i][last] = top;
			}
		}
		
		for (int i = 0; i < Matrix.length; i++) {
		    for (int j = 0; j < Matrix[i].length; j++) {
		        System.out.print(Matrix[i][j] + "   ");
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
		RotateMatrix rm = new RotateMatrix();
		if(rm.rotateMatrixclock(a))
			System.out.println("rotated");
		else
			System.out.println("not rotated");
	}
}
