package arrays;

import java.util.HashSet;
import java.util.Set;

// leetcode 219
public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    // Brute Force Approach
    // Time Complexity: O(N^2) and Space Complexity: O(1)
    public static boolean containsNearbyDuplicateBF(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= i + k && j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    // Sliding Window Approach
    // Time Complexity: O(N) and Space Complexity: O(min(N, K))
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // Maintain the size of the set to be at most k
            if (i > k)
                set.remove(nums[i - k - 1]);

            // If the element is already present in the set, we found a duplicate within k
            // distance
            if (!set.add(nums[i]))
                return true;
        }
        return false;
    }
}
