import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntSolutionTest {
    ReverseIntSolution test;

    @BeforeEach
    void setUp() {
        test = new ReverseIntSolution();
    }

    @Test
    void reverseTest1() {
        int x = 123;
        int solution = 321;
        assertEquals(solution, test.reverse(x));
    }

    @Test
    void reverseTestNegative() {
        int x = -123;
        int solution = -321;
        assertEquals(solution, test.reverse(x));
    }

    @Test
    void reverseTestZeros() {
        int x = 120;
        int solution = 21;
        assertEquals(solution, test.reverse(x));
    }

    @Test
    void reverseTestZeros2() {
        int x = 1534236469;
        int solution = 0;
        assertEquals(solution, test.reverse(x));
    }
}
