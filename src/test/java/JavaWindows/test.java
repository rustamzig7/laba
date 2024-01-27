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