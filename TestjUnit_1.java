import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestjUnit_1 {

    @Test
    public void testPrintMessage() {
        Main main = new Main();
        String message = "Hello, world!";
        assertEquals(message, main.printMessage(message));
    }
}
