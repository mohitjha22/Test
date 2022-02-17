import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayTest {

    @Test
    public void testSort() {
        int arr[] = new int[]{8,3,1,0,9};
        Array.sort(arr);
        int expected[] = new int[]{0,1,3,8,9};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMerge() {
        int arr1[] = new int[]{8,3,1,0,9};
        int arr2[] = new int[]{2,44,31,3};
        int expected[] = new int[]{8,3,1,0,9,2,44,31,3};
        int result[] = Array.merge(arr1, arr2);
        assertArrayEquals(expected, result);
    }
    
}
