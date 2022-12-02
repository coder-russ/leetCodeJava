/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 *
 *
 * Constraints:
 *
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 */

public class FindMedianSortedArraysSolution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = mergeArrays(nums1, nums2);
        double median;
        if (merged.length % 2 == 0) {
            median = ((double)merged[merged.length / 2 - 1] + (double)merged[merged.length / 2]) / 2;
        } else {
            median = merged[((merged.length + 1) / 2) - 1];
        }
        return median;
    }

    protected int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int mergedArrayIndex = 0;
        int pointerOne = 0;
        int pointerTwo = 0;
        while (pointerOne < nums1.length || pointerTwo < nums2.length) {
            int currentOneValue = pointerOne < nums1.length ? nums1[pointerOne] : 999999999;
            int currentTwoValue = pointerTwo < nums2.length ? nums2[pointerTwo] : 999999999;
            if (pointerOne >= nums1.length) {
                mergedArray[mergedArrayIndex] = currentTwoValue;
                mergedArrayIndex++;
                pointerTwo++;
                continue;
            }
            if (pointerTwo >= nums2.length) {
                mergedArray[mergedArrayIndex] = currentOneValue;
                mergedArrayIndex++;
                pointerOne++;
                continue;
            }
            int min = Math.min(currentOneValue, currentTwoValue);
            mergedArray[mergedArrayIndex] = min;
            mergedArrayIndex++;
            if (currentOneValue <= currentTwoValue) {
                pointerOne++;
            } else {
                pointerTwo++;
            }

        }
        return mergedArray;
    }
}
