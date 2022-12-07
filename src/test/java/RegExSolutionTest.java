import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegExSolutionTest {
    RegExSolution test;

    @BeforeEach
    void setUp() {
        test = new RegExSolution();
    }

    @Test
    void isMatchTest1() {
        String s = "aaacc";
        String p = "a*b*c*";
        boolean solution = true;
        assertEquals(solution, test.isMatch(s, p));
    }
}