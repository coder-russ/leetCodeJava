import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindMedianSortedArraysSolutionTest {

    FindMedianSortedArraysSolution test;

    @BeforeEach
    void setUp() {
        test = new FindMedianSortedArraysSolution();
    }

    @Test
    void testCaseMerged1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        int[] solution = {1, 2 ,3};
        assertEquals(Arrays.toString(solution), Arrays.toString(test.mergeArrays(nums1, nums2)));
    }

    @Test
    void testMerged2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        int[] solution = {1, 2 ,3, 4};
        assertEquals(Arrays.toString(solution), Arrays.toString(test.mergeArrays(nums1, nums2)));
    }

    @Test
    void testCaseMergeNegative() {
        int[] nums1 = {-12, -5, 2};
        int[] nums2 = {-1, 4, 77, 89};
        int[] solution = {-12, -5, -1, 2, 4, 77, 89};
        assertEquals(Arrays.toString(solution), Arrays.toString(test.mergeArrays(nums1, nums2)));
    }

    @Test
    void testCaseMedian1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double solution = 2;
        assertEquals(solution, test.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void testCaseMedian2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double solution = 2.5;
        assertEquals(solution, test.findMedianSortedArrays(nums1, nums2));
    }
    @Test
    void testCaseMedianNegative() {
        int[] nums1 = {-12, -5, 2};
        int[] nums2 = {-1, 4, 77, 89};
        double solution = 2;
        assertEquals(solution, test.findMedianSortedArrays(nums1, nums2));
    }

}