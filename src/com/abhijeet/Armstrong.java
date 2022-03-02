package com.abhijeet;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int armstrongNumbers[] = {};

        System.out.print("3 digit Armstrong numbers: ");

        for (int i=100; i<=999; i++) {
            if (isArmstrong(i))
                System.out.print(i + " ");
        }

        System.out.println("");
    }

    static boolean isArmstrong(int num) {
        int sum = 0;
        int n = num;
        while (n > 0) {
            int rem = n % 10;

            sum += (rem * rem * rem);
            n = n / 10;
        }

        return num == sum;
    }
}
