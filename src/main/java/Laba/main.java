package laba;

import java.util.Random;


public class RandomNumberGenerator {
	   public int generateRandomNumber() {
	        Random random = new Random();
	        return random.nextInt(451) + 250;
	    }
	
}


public class main {
    public static void main(String[] args) {
        ArrayCreator arrayCreator = new ArrayCreator();
        int[] randomArray = arrayCreator.createRandomArray();
        System.out.println("Получение радомные числа:");
        for (int i : randomArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortArray(randomArray);
        System.out.println("Сортировка массива:");
        for (int i : randomArray) {
            System.out.print(i + " ");
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

public class main {

}
