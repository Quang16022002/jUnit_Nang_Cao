import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class BubbleSortTest2 {

    @Test
    public void testBubbleSort() {
        // Test case 1: Testing with an unsorted array
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.bubbleSort(arr1);
        int[] expected1 = {11, 12, 22, 25, 34, 64, 90};
        assertArrayEquals(expected1, arr1);
    }
    
    @Test
    public void testEmptyArray() {
        // Test case 2: Testing with an empty array
        int[] arr2 = {};
        BubbleSort.bubbleSort(arr2);
        int[] expected2 = {};
        assertArrayEquals(expected2, arr2);
    }
    
    @Test
    public void testSingleElementArray() {
        // Test case 3: Testing with a single-element array
        int[] arr3 = {5};
        BubbleSort.bubbleSort(arr3);
        int[] expected3 = {5};
        assertArrayEquals(expected3, arr3);
    }
    
    @Test
    public void testAlreadySortedArray() {
        // Test case 4: Testing with an already sorted array
        int[] arr4 = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr4);
        int[] expected4 = {1, 2, 3, 4, 5};
        assertArrayEquals(expected4, arr4);
    }
    
    // Add more test cases to cover other scenarios and edge cases
}
