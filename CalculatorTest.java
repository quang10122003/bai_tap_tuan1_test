import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    // Phương thức thiết lập trước mỗi ca kiểm thử
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    // Kiểm thử phương thức add
    @Test
    public void testAdd() {
        assertEquals(8, calculator.add(3, 5));
    }

    // Kiểm thử phương thức subtract
    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    // Kiểm thử phương thức multiply
    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
    }

    // Kiểm thử phương thức divide
    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    // Kiểm thử phương thức divide với số chia là 0
    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    // Kiểm thử phương thức power
    @Test
    public void testPower() {
        assertEquals(125, calculator.power(5, 3));
    }

    // Kiểm thử phương thức power với số mũ âm
    @Test
    public void testPowerWithNegativeExponent() {
        assertThrows(IllegalArgumentException.class, () -> calculator.power(5, -3));
    }
}
