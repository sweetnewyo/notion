import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.angorbunov.delivery.Calc;
import ru.angorbunov.delivery.utils.Load;
import ru.angorbunov.delivery.utils.Size;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    private Calc calc;

    @BeforeEach
    public void setUp() {
        calc = new Calc();
    }

    @Test
    public void tests() {
        assertEquals(400, calc.calc(-1000, Size.BIG, false, Load.INCREASED));
        assertEquals(560, calc.calc(0, Size.SMALL, true, Load.HIGH));
        assertEquals(400, calc.calc(1, Size.BIG, false, Load.VERY_HIGH));
        assertEquals(450, calc.calc(1.9, Size.SMALL, true, Load.USUAL));
        assertEquals(400, calc.calc(1.99, Size.BIG, false, Load.USUAL));
        assertEquals(720, calc.calc(2, Size.SMALL, true, Load.VERY_HIGH));
        assertEquals(420, calc.calc(2.01, Size.BIG, false, Load.HIGH));
        assertEquals(600, calc.calc(2.1, Size.SMALL, true, Load.INCREASED));
        assertEquals(400, calc.calc(5, Size.BIG, false, Load.INCREASED));
        assertEquals(700, calc.calc(9, Size.SMALL, true, Load.HIGH));
        assertEquals(480, calc.calc(9.9, Size.BIG, false, Load.VERY_HIGH));
        assertEquals(500, calc.calc(9.99, Size.SMALL, true, Load.USUAL));
        assertEquals(400, calc.calc(10, Size.BIG, false, Load.USUAL));
        assertEquals(960, calc.calc(10.01, Size.SMALL, true, Load.VERY_HIGH));
        assertEquals(560, calc.calc(10.1, Size.BIG, false, Load.HIGH));
        assertEquals(720, calc.calc(21, Size.SMALL, true, Load.INCREASED));
        assertEquals(400, calc.calc(29, Size.BIG, false, Load.USUAL));
        assertEquals(720, calc.calc(29.9, Size.SMALL, true, Load.INCREASED));
        assertEquals(640, calc.calc(29.99, Size.BIG, false, Load.VERY_HIGH));
        assertEquals(840, calc.calc(30, Size.SMALL, true, Load.HIGH));
        assertEquals(500, calc.calc(30.01, Size.BIG, false, Load.USUAL));
        assertEquals(-1, calc.calc(30.1, Size.SMALL, true, Load.INCREASED));
        assertEquals(-1, calc.calc(50, Size.BIG, true, Load.HIGH));
        assertEquals(640, calc.calc(1000, Size.SMALL, false, Load.VERY_HIGH));
    }
}
