package com.tasks;

public class Fibonacci {
    private static long getFibonacci(int n) {
        if (n > 1) {
            return (getFibonacci(n - 2) + getFibonacci(n - 1));
        }
        return n;
    }

    public static void printFirstFiftyFibonachi() {
        for (int i = 1; i < 51; i++) {
            System.out.println(getFibonacci(i));
        }
    }
}
