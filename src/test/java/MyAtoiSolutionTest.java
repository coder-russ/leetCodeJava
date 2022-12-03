import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyAtoiSolutionTest {
    MyAtoiSolution test;

    @BeforeEach
    void setUp() {
        test = new MyAtoiSolution();
    }

    @Test
    void myAtoiTest1() {
        String s = "42";
        int solution = 42;
        assertEquals(solution, test.myAtoi(s));
    }

    @Test
    void myAtoiTest2() {
        String s = "   -42";
        int solution = -42;
        assertEquals(solution, test.myAtoi(s));
    }

    @Test
    void myAtoiTest3() {
        String s = "4193 with words";
        int solution = 4193;
        assertEquals(solution, test.myAtoi(s));
    }

    @Test
    void myAtoiTest4() {
        String s = "words and 987";
        int solution = 0;
        assertEquals(solution, test.myAtoi(s));
    }

    @Test
    void myAtoiTest5() {
        String s = "-91283472332";
        int solution = -2147483648;
        assertEquals(solution, test.myAtoi(s));
    }
}