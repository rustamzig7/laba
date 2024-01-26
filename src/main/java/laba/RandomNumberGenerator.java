package laba;

import java.util.Random;


public class RandomNumberGenerator {
	   public int generateRandomNumber() {
	        Random random = new Random();
	        return random.nextInt(451) + 250;
	    }
	
}
