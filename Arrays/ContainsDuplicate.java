package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums));
    }

    // Brute Force Approach - O(n^2) time complexity and O(1) space complexity
    public static boolean containsDuplicateBruteForce(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n; i++) {

            // Check for duplicates in the remaining array
            for (int j = i + 1; j < n; j++) {

                // If a duplicate is found, return true
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Optimal Approach - O(n) time complexity and O(n) space complexity using
    // HashSet
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {

            // If the number is already in the set, we found a duplicate
            if (!seen.add(num)) {
                return true;
            }

            // Alternative way using contains method
            // if (seen.contains(num)) {
            // return true;
            // }
            // seen.add(num);
        }

        return false;
    }

    // Sorting Approach - O(n log n) time complexity and O(1) space complexity
    public static boolean containsDuplicateSorting(int[] nums) {

        // Sort the array
        Arrays.sort(nums);

        // check duplicates in the sorted array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
}