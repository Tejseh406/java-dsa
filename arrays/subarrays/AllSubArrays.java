package arrays.subarrays;

public class AllSubArrays {

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[][] result = solve(A);
        for (int[] subArray : result) {
            for (int num : subArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Time Complexity: O(n^3)
     public static  int[][] solve(int[] A) {
        int n = A.length;
        // The total number of subarrays of an array of size n is n*(n+1)/2
        int rowsize = n * (n + 1) / 2;
        // Create a 2D array of length rowsize to store all subarrays
        int[][] arr = new int[rowsize][];
        int rowIndex = 0;

        //Outer loop to fix the starting point of the subarray
        for(int i=0;i<n;i++){
            //Inner loop to fix the ending point of the subarray
            for(int j=i;j<n;j++){

                // dynamically create a subarray from index i to j and store it in the 2D array
                arr[rowIndex] = new int[j-i+1];
                int colIndex  = 0;

                // iterate from i to j and fill the subarray in the 2D array
                for(int k = i;k<=j;k++){
                    arr[rowIndex][colIndex] = A[k];
                    colIndex++;
                }

                rowIndex++; 

            }    
        }
        return arr;
    }
}