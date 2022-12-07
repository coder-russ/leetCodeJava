public class MaxAreaSolution {
    public int maxArea(int[] height) {
        int solution = 0;
        int left = 0;
        int right = height.length - 1;
        while (left != right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            solution = Math.max(solution, area);
            if (height[left] >= height[right]) {
                right--;
            } else {
                left++;
            }

        }
        return solution;
    }
}
