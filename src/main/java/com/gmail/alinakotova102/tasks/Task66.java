package com.gmail.alinakotova102.tasks;

import java.util.Arrays;

public class Task66 {
    /**
     * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
     *
     * Increment the large integer by one
     * @return the resulting array of digits.
     */
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        if (digits.length==1){
            String [] digit = String.valueOf(digits[0]).split("");
            digits = new int[digit.length];
            for (int i =0; i< digit.length; i++){
                digits[i]= Integer.parseInt(digit[i]);
            }
            return digits;
        }
        return digits;
    }
}