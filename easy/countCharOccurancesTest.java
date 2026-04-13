package easy;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream; 

public class countCharOccurancesTest {

    @Test
    public void testCounter() {
        countCharOccurances cc = new countCharOccurances();
        int[] result = countCharOccurances.counter("AaBb Cc123!{");
        
        assertEquals(2, result[0]); 
        assertEquals(2, result[1]); 
        assertEquals(2, result[2]); 
        assertEquals(0, result[3]); 
        
        int total = 0;
        for (int count : result) {
            total += count;
        }
        assertEquals(6, total);
        
        assertEquals(0, countCharOccurances.counter(null).length);
        assertEquals(0, countCharOccurances.counter("   ").length);
    }

    @Test
    public void testPrintCounter() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        int[] mockCounter = new int[26];
        mockCounter[0] = 1; // a
        mockCounter[2] = 3; // c

        countCharOccurances.printCounter(mockCounter);

        String output = outContent.toString();
        
        assertTrue(output.contains("a: 1"));
        assertTrue(output.contains("b: 0"));
        assertTrue(output.contains("c: 3"));
        assertTrue(output.contains("z: 0"));

        System.setOut(System.out);
    }
}
