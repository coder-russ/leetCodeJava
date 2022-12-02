import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromeSolutionTest {
    LongestPalindromeSolution test;

    @BeforeEach
    void setUp() {
        test = new LongestPalindromeSolution();
    }

    @Test
    void longestPalindromeTest1() {
        String s = "babad";
        String solution = "aba";
        assertEquals(solution, test.longestPalindrome(s));
    }

    @Test
    void longestPalindromeTest2() {
        String s = "cbbd";
        String solution = "bb";
        assertEquals(solution, test.longestPalindrome(s));
    }
}