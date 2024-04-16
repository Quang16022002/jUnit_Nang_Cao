import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestjUnit_2 {

    @Test
    public void testPrintMessage() {
        Main main = new Main();
        String message = "Hello, world!";
        assertEquals(message, main.printMessage(message));
    }

    @Test
    public void testPrintEvenNumbers() {
        Main main = new Main();
        int[] numbers = {1, 2, 3, 4, 5};
        assertDoesNotThrow(() -> main.printEvenNumbers(numbers));
    }
}
