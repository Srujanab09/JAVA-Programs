package randomNumber;

import java.util.Random;

public class RandomNumbBwRange {

	public void generateRandomNumb(int start, int end){
		
		if(end % 2 == 0)
			--end;
		if(start %2 == 0)
			++start;
		for(int i=start; i<=end; i++){
		int Random_No = start + 2*(int)(Math.random()*((end-start)/2+1));
		System.out.println(Random_No);
		}
	}
	
	public static void main(String args[]){
		RandomNumbBwRange r = new RandomNumbBwRange();
		r.generateRandomNumb(10, 30);
		
	}
	
	
}
