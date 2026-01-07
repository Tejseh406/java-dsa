package Maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 123456;
        int reversed = reverseNumber(number);
        System.out.println("Reversed number is: " + reversed);
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int rem = num % 10;
            reversed = reversed * 10 + rem;
            num /= 10;
        }
        return reversed;
    }
}