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


