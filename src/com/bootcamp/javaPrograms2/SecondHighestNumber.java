package com.bootcamp.javaPrograms2;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 7, 2, 8, 9, 15, 12};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > firstMax) {
                secondMax = firstMax;
                firstMax = number;
            } else if (number > secondMax && number < firstMax) {
                secondMax = number;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second highest number.");
        } else {
            System.out.println("The second highest number is: " + secondMax);
        }
    }
}
