package com.gmail.alinakotova102.tasks;

public class Task1 {
    /**
     Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     You may assume that each input would have exactly one solution, and you may not use the same
     element twice.
     * @return the answer in any order
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[i] + nums[j + 1] == target) {
                    return new int[]{i, j + 1};
                }
            }
        }
        return null;
    }
}
