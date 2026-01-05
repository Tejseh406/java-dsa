package Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
        pushZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Optimal Approach - Using Count of non-zero elements
    // O(n) time and O(1)space
    private static void pushZerosToEnd(int[] arr) {
        int j = 0; // Pointer for next non-zero element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    // Brute Force Approach - O(n) time and O(n) space
    public static void pushZerosToEndBruteForce(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        // Copy non-zero elements to temp array
        for (int num : arr) {
            if (num != 0) {
                temp[index++] = num;
            }
        }

        // Fill remaining positions with zeros
        while (index < arr.length) {
            temp[index++] = 0;
        }

        // Copy all the elements from temp[] to arr[]
        for (int i = 0; i < arr.length; i++)
            arr[i] = temp[i];
    }

    // Better Approach - Two Pointer Approach - O(n) time and O(1) space
    // Time Complexity: O(x+(n-x)) = O(n) and Space Complexity: O(1)
    public static void pushZerosToEndBetter(int[] arr) {
        int j = -1;

        // Find the first zero's index - O(x)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1)
            return; // No zeros found

        // Traverse the array from j+1 to end - O(n-x)
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

}
