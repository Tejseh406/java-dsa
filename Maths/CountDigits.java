package maths;

public class CountDigits {
    public static void main(String[] args) {
        int number = 123456;
        int count = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + count);
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 1; // Special case for 0
        }
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
