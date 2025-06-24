import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorIntegrationTest {
    @Test
    public void testAddAndMultiply() {
        Calculator calc = new Calculator();
        int sum = calc.add(2, 3); // 5
        int product = calc.multiply(sum, 4); // 20
        assertEquals(20, product);
    }

    @Test
    public void testSubtractAndDivide() {
        Calculator calc = new Calculator();
        int diff = calc.subtract(10, 4); // 6
        int result = calc.divide(diff, 2); // 3
        assertEquals(3, result);
    }
}
