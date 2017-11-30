package randomNumber;

import java.util.Random;

public class RandomNumberGenertn {

	public void generateRandomInt(){
		
		
		Random ran = new Random();
		
		for(int i=0; i< 10; i++){
		int result = ran.nextInt(99);
		System.out.println(result);
		}
		
	}
	
	public static void main(String args[]){
		RandomNumberGenertn r = new RandomNumberGenertn();
		r.generateRandomInt();
		
	}
}
