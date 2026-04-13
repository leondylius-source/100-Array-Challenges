package easy;
import org.junit.Test;
import static org.junit.Assert.*; 

public class secondLargestTest {
    
    secondLargest sl = new secondLargest();

    @Test
    public void testValidation(){
        assertFalse(secondLargest.validation(new int[]{0}));
        assertFalse(secondLargest.validation(new int[]{}));
        assertFalse(secondLargest.validation(null));
    }

    @Test
    public void testOutput(){
        assertEquals(4, secondLargest.output(new int[]{1, 2, 3, 4, 5}));
        assertEquals(4, secondLargest.output(new int[]{5, 4, 3, 2, 1}));
        assertEquals(4, secondLargest.output(new int[]{1, 2, 3, 4, 5, 5}));
        assertEquals(4, secondLargest.output(new int[]{5, 5, 4, 3, 2, 1}));
        assertEquals(1, secondLargest.output(new int[]{1, -2, -3, 4}));
        assertEquals(1, secondLargest.output(new int[]{-4, -3, 2, 1}));
        assertEquals(Integer.MIN_VALUE, secondLargest.output(new int[]{1}));
    }


}
