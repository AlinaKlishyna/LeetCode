package com.gmail.alinakotova102.tasks;

import java.util.Arrays;

import static java.lang.Long.*;

public class Task66 {
    /**
     * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
     *
     * Increment the large integer by one
     * @return the resulting array of digits.
     */
//    public int[] plusOne(int[] digits) {
//        digits[digits.length-1]++;
//        if (digits.length==1){
//            String [] digit = String.valueOf(digits[0]).split("");
//            digits = new int[digit.length];
//            for (int i =0; i< digit.length; i++){
//                digits[i]= Integer.parseInt(digit[i]);
//            }
//            return digits;
//        }
//        return digits;
//    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Task66().plusOne(new int[]{10})));
        System.out.println(Arrays.toString(new Task66().plusOne(new int[]{3,2,1})));
        System.out.println(Arrays.toString(new Task66().plusOne(new int[]{9,9})));
        System.out.println(Arrays.toString(new Task66().plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));

        System.out.println(Arrays.toString(new Task66().plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6})));
    }
    public int[] plusOne(int[] digits) {
        String text = "";
        for (int element:digits) {
            text+=element;
        }
        if (text.length() >10){
            
        }else {
            Integer res = Integer.valueOf(text);
            res++;
            text = String.valueOf(res);
            String[] ch = text.split("");
            digits = new int[ch.length];
            for (int i = 0; i < ch.length; i++) {
                digits[i] = Integer.parseInt(ch[i]);
            }
        }
        return digits;
    }
}