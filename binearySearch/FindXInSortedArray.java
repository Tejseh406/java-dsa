package binearySearch;

public class FindXInSortedArray {
    public int search(int[] nums, int target) {
        int left = 0; // initialize left pointer to 0
        int right = nums.length - 1; // initialize right pointer to the last index of the array
        
        while (left <= right) { // continue the loop till left pointer is less than or equal to right pointer
            int mid = left + (right - left) / 2; // calculate the middle index of the array
            
            if (nums[mid] == target) { // check if the middle element is equal to target
                return mid; // return the middle index
            } else if (nums[mid] < target) { // check if the middle element is less than target
                left = mid + 1; // move the left pointer to the right of middle element
            } else { // if the middle element is greater than target
                right = mid - 1; // move the right pointer to the left of middle element
            }
        }
        
        return -1; // target not found in the array
    }

    public static void main(String[] args) {
        FindXInSortedArray finder = new FindXInSortedArray();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = finder.search(nums, target);
        System.out.println("Index of target " + target + ": " + result); // Output: Index of target 9: 4
    }
}

//Time complexity : O(log n) - The search space is halved with each iteration.
//Space complexity : O(1) - No additional space is used that scales with input size
