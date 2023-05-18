import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(1, calculator.add(1 , 0));
    }

    @Test
    void dif() {
        assertEquals(-1, calculator.dif(2 , 3));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(4 , 2));
    }

    @Test
    void times() {
        assertEquals(176, calculator.times(22 , 8));
    }

    @Test
    void solver() {
        assertEquals(8, calculator.solver());
    }
}