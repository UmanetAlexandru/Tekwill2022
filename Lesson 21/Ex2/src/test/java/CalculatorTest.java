import org.example.Calculator;
import org.example.CalculatorEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class CalculatorTest {
    @Mock
    private CalculatorEngine engine = Mockito.mock(CalculatorEngine.class);
    private final Calculator calculator = new Calculator(engine);

    @Test
    void testDivideCase01() {
        Mockito.when(engine.divide(0, 1)).thenReturn(0);
        Assertions.assertEquals("Division of 0 by 1 = 0", calculator.divide(0, 1));
    }

    @Test
    void testDivideCase11() {
        Mockito.when(engine.divide(1, 1)).thenReturn(1);
        Assertions.assertEquals("Division of 1 by 1 = 1", calculator.divide(1, 1));
    }

    @Test
    void testDivideCase12() {
        Mockito.when(engine.divide(1, 2)).thenReturn(0);
        Assertions.assertEquals("Division of 1 by 2 = 0", calculator.divide(1, 2));
    }

    @Test
    void testDivideCaseZeroDivider() {
        Mockito.when(engine.divide(1, 0)).thenThrow(new ArithmeticException());
        Assertions.assertEquals("Division by zero is prohibited", calculator.divide(1, 0));
    }
}