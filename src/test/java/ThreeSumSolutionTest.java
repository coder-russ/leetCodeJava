import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSumSolutionTest {
    ThreeSumSolution test;

    @BeforeEach
    void setUp() {
        test = new ThreeSumSolution();
    }

    @Test
    void threeSumTestOne() {
        int[] input = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(-1, -1, 2));
        output.add(Arrays.asList(-1, 0, 1));
        Assertions.assertEquals(output, test.threeSum(input));
    }
}