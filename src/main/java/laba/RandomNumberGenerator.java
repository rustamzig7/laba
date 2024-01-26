package laba;

import java.util.Random;


public class RandomNumberGenerator {
	   public int generateRandomNumber() {
	        Random random = new Random();
	        return random.nextInt(451) + 250;
	    }
	
}

class ArrayCreator {
    public int[] createRandomArray() {
        int[] array = new int[12];
        RandomNumberGenerator rng = new RandomNumberGenerator();
        for (int i = 0; i < array.length; i++) {
            array[i] = rng.generateRandomNumber();
        }
        return array;
    }
}
