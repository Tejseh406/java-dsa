package bitmanipulation;

public class SwapNum {
    int a = 5;
    int b = 10;

    public static void main(String[] args) {
        SwapNum swapNum = new SwapNum();
        System.out.println("Before swapping: a = " + swapNum.a + ", b = " + swapNum.b);
        swapNum.swap();
        System.out.println("After swapping: a = " + swapNum.a + ", b = " + swapNum.b);
    }

    public void swap() {
        a = a ^ b; // Step 1: a now holds the result of a XOR b  ==> 1010 XOR 1010 = 1111 (15 in decimal)
        b = a ^ b; // Step 2: b now holds the original value of a ==> 1111 XOR 1010 = 0101 (5 in decimal)
        a = a ^ b; // Step 3: a now holds the original value of b ==> 1111 XOR 0101 = 1010 (10 in decimal)
    }
}
