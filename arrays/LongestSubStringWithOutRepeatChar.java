package arrays;

import java.util.*;

//leetcode 3
public class LongestSubStringWithOutRepeatChar {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    // Sliding Window + HashSet
    // Time Complexity: O(N) and Space Complexity: O(min(N,M)) where N is length of
    // string and M is size of charset
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}