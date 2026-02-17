package queue;

import java.util.PriorityQueue;

public class KthLargestELement {
     
     public static void main(String[] args) {
       int[] arr = {3,2,1,5,6,4};
      
       int largest = findKthLargest(arr,3);
       System.out.println(largest);
     }

    
    public static int findKthLargest(int[] nums, int k) {

        //Other method - Sort array and return kth largest element

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int i = 0;

        // Iterate array
        while(i < nums.length){
            
            //Add elements to the queue when size is less than k
            if(pq.size() < k) pq.add(nums[i]);

            // if num is less than min value priority queue
            // Remove element and add num to the queue
            else if(nums[i] > pq.peek()){
                pq.remove();
                pq.add(nums[i]);
            }

            i++;
        }

        return pq.remove();
    }
}
