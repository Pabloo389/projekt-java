import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorPowerTest {
    @Test
    public void testPower() {
        Calculator calc = new Calculator();
        int result = calc.power(2, 3);  // 2 do potęgi 3 = 8
        assertEquals(8, result);

        result = calc.power(5, 0);      // dowolna liczba do potęgi 0 = 1
        assertEquals(1, result);

        result = calc.power(3, 1);      // liczba do potęgi 1 = liczba
        assertEquals(3, result);
    }
}
