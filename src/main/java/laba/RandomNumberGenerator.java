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

class BubbleSort {
    public void sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
