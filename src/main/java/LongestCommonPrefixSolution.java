/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
public class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String prefix = "";
        int currentIndex = 0;
        try {
            while (currentIndex < strs[0].length()) {
                char currentLetter = strs[0].charAt(currentIndex);
                for (String str : strs) {
                    if (!(str.charAt(currentIndex) == currentLetter)) {
                        return prefix;
                    }
                }
                prefix = prefix + currentLetter;
                currentIndex++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return prefix;
        }
        return prefix;
    }
}
