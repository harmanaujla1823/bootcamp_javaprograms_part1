package com.bootcamp.javaPrograms2;

import java.util.Scanner;

public class FactorialUsingRecursion {

    public static long findFactorial(int n) {
        if (n == 0) {
            return 1; 
        } else {
            return n * findFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = findFactorial(num);
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }
}
