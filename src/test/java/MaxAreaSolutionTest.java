import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MaxAreaSolutionTest {
    MaxAreaSolution test;

    @BeforeEach
    void setUp() {
        test = new MaxAreaSolution();
    }

    @Test
    void maxAreaTest1() {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int solution = 49;
        assertEquals(solution, test.maxArea(heights));
    }

    @Test
    void maxAreaTest2() {
        int[] heights = {1, 1};
        int solution = 1;
        assertEquals(solution, test.maxArea(heights));
    }

    @Test
    void maxAreaTest3() {
        int[] heights = {2, 3, 10, 5, 7, 8, 9};
        int solution = 36;
        assertEquals(solution, test.maxArea(heights));
    }
}