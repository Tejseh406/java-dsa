package Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 1, 9, 3 };
        int numToFind = 7;
        int resultIndex = linearSearch(arr, numToFind);

        if (resultIndex != -1) {
            System.out.println("Element " + numToFind + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + numToFind + " not found in the array.");
        }
    }

    public static int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i; // num found at index i
            }
        }
        return -1; // num not found
    }
}
