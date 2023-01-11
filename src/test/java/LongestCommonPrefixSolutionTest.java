import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixSolutionTest {
    LongestCommonPrefixSolution test;

    @BeforeEach
    void setUp() {
        test = new LongestCommonPrefixSolution();
    }

    @Test
    void longestCommonPrefixTest1() {
        String[] input = {"flower", "flow", "flight"};
        String solution = "fl";
        assertEquals(solution, test.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefixTest2() {
        String[] input = {"dog", "racecar", "car"};
        String solution = "";
        assertEquals(solution, test.longestCommonPrefix(input));
    }

    @Test
    void longestCommonPrefixTestOutOfBounds() {
        String[] input = {"dog", "do", "d"};
        String solution = "d";
        assertEquals(solution, test.longestCommonPrefix(input));
    }
}