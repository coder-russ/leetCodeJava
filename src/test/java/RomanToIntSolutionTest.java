import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntSolutionTest {
    RomanToIntSolution test;

    @BeforeEach
    void setUp() {
        test = new RomanToIntSolution();
    }

    @Test
    void romanToIntTest1() {
        String s = "III";
        int solution = 3;
        assertEquals(solution, test.romanToInt(s));
    }

    @Test
    void romanToIntTest2() {
        String s = "LVIII";
        int solution = 58;
        assertEquals(solution, test.romanToInt(s));
    }

    @Test
    void romanToIntTest3() {
        String s = "MCMXCIV";
        int solution = 1994;
        assertEquals(solution, test.romanToInt(s));
    }
}