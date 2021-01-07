package hundred_days_challenge;

import java.util.Arrays;

/**
 * @author abdelrahmanelessawy, 07/01/2021
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[128];
        Arrays.fill(map, -1);
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map[c] != -1) {
                start = Math.max(start, map[c] + 1);
            }
            map[c] = i;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
