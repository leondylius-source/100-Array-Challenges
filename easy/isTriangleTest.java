package easy;
import org.junit.Test;
import static org.junit.Assert.*; 

public class isTriangleTest {
    
    isTriangle triangle = new isTriangle();
    
    @Test
    public void triangles(){
        assertTrue("Basic triangle", isTriangle.checker(0, 4, 0, 0, 0, 3));
        assertFalse("Horizontal line", isTriangle.checker(1, 5, 10, 2, 2, 2));
        assertFalse("Vertical line", isTriangle.checker(5, 5, 5, 1, 10, 20));
        assertFalse("Diagonal line", isTriangle.checker(1, 2, 3, 1, 2, 3));
        assertFalse("Large overflow line", isTriangle.checker(0, 100000, 200000, 0, 100000, 200000));
    }
}
