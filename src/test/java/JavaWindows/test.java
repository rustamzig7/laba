package JavaWindows;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;




public class test {
@Test
    public void testCreateRandomArray() {
        ArrayCreator creator = new ArrayCreator();
        int[] randomArray = creator.createRandomArray();

        // Test if the array has the correct length
        assertEquals("Array length is not 12", 12, randomArray.length);

        // Test if the array contains numbers within the expected range
        for (int number : randomArray) {
            assertTrue("Number is outside the expected range", number >= 250 && number <= 700);
        }
    }@Test
    public void testCreateRandomArray() {
        ArrayCreator creator = new ArrayCreator();
        int[] randomArray = creator.createRandomArray();

        // Test if the array has the correct length
        assertEquals("Array length is not 12", 12, randomArray.length);

        // Test if the array contains numbers within the expected range
        for (int number : randomArray) {
            assertTrue("Number is outside the expected range", number >= 250 && number <= 700);
        }
    }

@Test
    public void testCreateRandomArray() {
        ArrayCreator creator = new ArrayCreator();
        int[] randomArray = creator.createRandomArray();

        // Test if the array has the correct length
        assertEquals("Array length is not 12", 12, randomArray.length);

        // Test if the array contains numbers within the expected range
        for (int number : randomArray) {
            assertTrue("Number is outside the expected range", number >= 250 && number <= 700);
        }
    }

@Test
    public void testBubbleSort() {
        int[] unsortedArray = {7, 3, 5, 2, 1, 4, 6};
        BubbleSort sorter = new BubbleSort();

        sorter.sortArray(unsortedArray);

        // Test if the array is sorted in ascending order
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7};
        assertEquals("Array is not sorted", sortedArray, unsortedArray);
    }
}


