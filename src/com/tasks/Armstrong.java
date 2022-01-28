package com.tasks;

public class Armstrong {
    public static boolean isArmstrong(int number) {
        int temp = 0;
        int digits = 0;
        int last = 0;
        int sum = 0;

        temp = number;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = number;

        while (temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, digits);
            temp /= 10;
        }

        return number == sum;
    }
}
