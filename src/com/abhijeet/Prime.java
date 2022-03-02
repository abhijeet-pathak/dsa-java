package com.abhijeet;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("isPrime?\nEnter a number: ");
        int n = s.nextInt();

        System.out.println("Is Prime: " + isPrime(n));
    }

    static boolean isPrime(int num) {
        int c = 2;

        while (c*c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }

        return c * c > num;
    }
}
