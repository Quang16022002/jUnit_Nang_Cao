import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class BubbleSortTest1 {
    
    @Test
    public void testBubbleSort() {
        // Test case 1: Testing with an unsorted array
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.bubbleSort(arr1);
        int[] expected1 = {11, 12, 22, 25, 34, 64, 90};
        assertArrayEquals(expected1, arr1);
        
        // Test case 2: Testing with an already sorted array
        int[] arr2 = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr2);
        int[] expected2 = {1, 2, 3, 4, 5};
        assertArrayEquals(expected2, arr2);
        
        // Test case 3: Testing with a reverse sorted array
        int[] arr3 = {5, 4, 3, 2, 1};
        BubbleSort.bubbleSort(arr3);
        int[] expected3 = {1, 2, 3, 4, 5};
        assertArrayEquals(expected3, arr3);
        
        // Add more test cases as needed to cover different scenarios
    }
}
