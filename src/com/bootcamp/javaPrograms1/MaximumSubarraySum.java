package com.bootcamp.javaPrograms1;

public class MaximumSubarraySum {
    public static int findMaximumSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int maxSum = findMaximumSubarraySum(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
