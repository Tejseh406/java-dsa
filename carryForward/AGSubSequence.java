package carryforward;

public class AGSubSequence {

    public static void main(String[] args) {
        String A = "ABCGAG";
        System.out.println(solve(A));
    }

    // This method calculates the number of subsequences of the form "AG" in the given string A
    public static long solve(String A) {
        long count = 0;
        long sum = 0;
        for (char ch : A.toCharArray()) {
            // If the character is 'A', increment the count of 'A's seen so far
            if (ch == 'A')
                count++;
            // If the character is 'G', add the count of A's seen before G to the sum
            else if (ch == 'G')
                sum += count;
        }

        return sum;
    }
}
