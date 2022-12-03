import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeNumberSolutionTest {
    PalindromeNumberSolution test;

    @BeforeEach
    void setUp() {
        test = new PalindromeNumberSolution();
    }

    @Test
    void isPalindromeTest1() {
        int input = 121;
        boolean solution = true;
        assertEquals(solution, test.isPalindrome(input));
    }

    @Test
    void isPalindromeTestNegative() {
        int input = -121;
        boolean solution = false;
        assertEquals(solution, test.isPalindrome(input));
    }

    @Test
    void isPalindromeTestFalse() {
        int input = 10;
        boolean solution = false;
        assertEquals(solution, test.isPalindrome(input));
    }
}