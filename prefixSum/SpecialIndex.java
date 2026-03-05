package prefixsum;

public class SpecialIndex {

    public static void main(String[] args){
        int[] A = {2, 1, 6, 4};
        int result = countSpecialIndices(A);
        System.out.println(result);
    }

    public static int countSpecialIndices(int[] A) {
        int n = A.length;

        // Create prefix sum arrays for odd and even indexed elements
        int[] pso = new int[n];
        int[] pse = new int[n];
        int count = 0;

        pso[0] = 0;
        pse[0] = A[0];

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) { // Even index

                // prefix sum for even indexed elements
                pse[i] = A[i] + pse[i - 1];
                // prefix sum for odd indexed elements remains the same
                pso[i] = pso[i - 1];
            } else {
                pso[i] = pso[i - 1] + A[i];
                pse[i] = pse[i - 1];
            }
        }

        // Check for each index if it is a special index
        for (int i = 0; i < n; i++) {
            int se = 0;
            int so = 0;

            // Calculate the sum of even and odd indexed elements after removing the current index
            if (i == 0) {
                se = pso[n - 1] - pso[i];
                so = pse[n - 1] - pse[i];
            } else {
                // Sum of even indexed elements after removing the current index
                se = pse[i - 1] + pso[n - 1] - pso[i];
                // Sum of odd indexed elements after removing the current index
                so = pso[i - 1] + pse[n - 1] - pse[i];
            }

            // If the sums are equal, increment the count of special indices
            if (se == so)
                count++;
        }
        return count;
    }
}