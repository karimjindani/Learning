import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyIntegersTest {

    @Test
    public void testNoArguments() {
        String[] args = {};
        String result = MultiplyIntegers.main(args);
        assertEquals("Please provide at least one integer as an argument.", result);
    }

    @Test
    public void testSingleArgument() {
        String[] args = {"7"};
        String result = MultiplyIntegers.main(args);
        assertEquals("7", result);
    }

    @Test
    public void testTwoArguments() {
        String[] args = {"5", "6"};
        String result = MultiplyIntegers.main(args);
        assertEquals("30", result);
    }
}
