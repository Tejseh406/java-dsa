package prefixsum;
import java.util.ArrayList;

//Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.

public class LeadersInArray {

    public static void main(String[] args){
        int[] A = {16, 17, 4, 3, 5, 2};
        int[] result = findLeaders(A);
        for (int leader : result) {
            System.out.println(leader);
        }
    }

    // Function to find leaders in the array
     public static int[] findLeaders(int[] A) {
        int n = A.length;
        
        // Create an ArrayList to store the leaders
        ArrayList<Integer> arr = new ArrayList<>();

        // Rightmost element is always a leader
        int max  = A[n-1];

        arr.add(max);

        // Traverse the array from right to left
        for(int i=n-2;i>=0;i--){

            // If the current element is greater than the maximum element found so far, it is a leader
            if(A[i] > max){
                arr.add(A[i]);
                max = A[i];
            }
        }

        // Since we added leaders from right to left, we need to reverse the list to maintain the original order
        int[] output = new int[arr.size()];
        int index = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            output[index++] = arr.get(i);
        }

        return output;
    }
}

