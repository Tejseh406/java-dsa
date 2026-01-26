package arrays;
import java.util.*;

// leetcode 2461
public class MaximumSumOfDistinctArrayLenK {

    public static void main(String[] args) {
        int[] nums = {4, 2, 4, 5, 6};
        int k = 3;
        System.out.println(maximumSubarraySum(nums, k));
    }


    // Sliding Window + HashSet
    // Time Complexity: O(N) and Space Complexity: O(K)
    public static long maximumSubarraySum(int[] nums, int k) {
        long maxSum =0, curSum =0;
        int left = 0;
        Set<Integer> set = new HashSet<>();

        for(int right =0;right<nums.length;right++){
            while(set.contains(nums[right]) || set.size() == k){
                set.remove(nums[left]);
                curSum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            curSum += nums[right];

            if(set.size() == k){
                maxSum = Math.max(curSum, maxSum);
            }
        }

        return maxSum;
    }
}