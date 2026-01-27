package arrays;
// leet code 209
public class MinSizeSubArrSum {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println("Optimal Solution"+minSubArrayLen(target, nums));
        System.err.println("Brute Force"+minSubArrayLenBF(target, nums));
    }

    // Brute Force Approach
    // Time Complexity: O(N^2) and Space Complexity: O(1)
    private  static int minSubArrayLenBF(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                if (currentSum >= target) {
                    minLength = Math.min(minLength, j - i + 1);
                    break;
                }
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }


    // Sliding Window Approach
    // Time Complexity: O(N) and Space Complexity: O(1)
    private static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int currentSum = 0;

        for (int right = 0; right < n; right++) {
            currentSum += nums[right];

            // Shrink the window as small as possible while the window's sum is larger than or equal to target
            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
