package dp;

import java.util.Scanner;

public class Fibonocci {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n+1];
        
        System.out.println("Top down approach " + fib(n,dp));
        System.out.println("Bootom up approach " + fibBottomUp(n));
    }

    // Using top down approach - dynamic programming
    public static int fib(int n, int[] dp){
        if(n==0 || n==1) return n;
        if(dp[n] != 0 ) return dp[n];

        int nm1 = fib(n-1,dp);
        int nm2 = fib(n-2,dp);

        dp[n] = nm1+nm2;

        return nm1+nm2;
    }

    //Bottom up approach
    public static int fibBottomUp(int n){
        int[] dp = new int[n+1];

        dp[0] = 0 ;
        dp[1] = 1;

        for(int i =2;i<dp.length;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}