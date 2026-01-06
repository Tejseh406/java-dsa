package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        System.out.println(missingNumberUsingXor(nums));
    }

    // Optimal Approach using XOR - O(n) time complexity and O(1) space complexity
    public static int missingNumberUsingXor(int[] nums) {
        int n = nums.length;
        int missing = n;

        for (int i = 0; i < n; i++) {
            missing ^= i ^ nums[i];
        }

        // Dry run : 3^0^3^1^0^2^1 = 2
        // 0^0=0, 0^num=num, num^num=0, 1^0=1, 1^1=0

        return missing;
    }

    // Approach using Sum Formula - O(n) time complexity and O(1) space complexity
    public static int missingNumberUsingSum(int[] nums) {
        int n = nums.length;

        // Sum of first n natural numbers = n*(n+1)/2
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    // Brute Force Approach - O(n^2) time complexity and O(1) space complexity
    public static int missingNumberUsingBruteForce(int[] nums) {
        int n = nums.length;

        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }

        return -1; // This line should never be reached
    }
}
