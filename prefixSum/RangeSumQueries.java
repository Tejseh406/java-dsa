package prefixSum;

public class RangeSumQueries {

    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0, 3}, {1, 2}, {0, 4}};
        long[] result = rangeSum(A, B);
        for (long sum : result) {
            System.out.println(sum);
        }
    }
    
     public static long[] rangeSum(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;

        // Create prefix sum array
        long[] ps = new long[n];
        long[] output = new long[m];

        ps[0] = A[0];

        // Build the prefix sum array
        for(int i = 1;i<n;i++){
            // prefix sum formula 
            ps[i] = ps[i-1] + A[i];
        }

        // Process each query in B
        for(int j=0;j< m; j++){
            // Get the start and end indices for the current query
           int s = B[j][0];
           int e = B[j][1];

           // start index is 0, then the sum is just the prefix sum at end index
           if( s == 0){
               output[j] = ps[e];
           }else{
                // Otherwise, the sum is the difference between the prefix sum at end index and the prefix sum at start index - 1
                // sum (s, e) = ps[e] - ps[s-1]
               output[j] = ps[e] - ps[s-1];
           }
        }

        return output;
    }
}
