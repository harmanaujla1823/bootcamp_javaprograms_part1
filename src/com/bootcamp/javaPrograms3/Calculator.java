package com.bootcamp.javaPrograms3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Select operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                System.exit(1);
        }
        
        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        
        scanner.close();
    }
}
