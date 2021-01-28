package com.narine;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        boolean negativeNum = false;
        double sumOfPositive = 0.0;
        double amount = 0.0;
        double average;

        double [] nums = {12.3, -3.4, 95.6, 14.5, 31.2, -7.8, 94.5, 16.7, -9.1, 17.8, 6.7, -6.7, 19.1, -27.8, -1.2};

        for (double currentNum: nums) {
            if (!negativeNum && currentNum < 0) {
                negativeNum = true;
                continue;
            }

            if (negativeNum && currentNum > 0) {
                sumOfPositive += currentNum;
                amount ++;
            }
        }

        average = sumOfPositive/amount;
        System.out.println( "(12.3, -3.4, 95.6, 14.5, 31.2, -7.8, 94.5, 16.7, " +
                "-9.1, 17.8, 6.7, -6.7, 19.1, -27.8, -1.2) = " + average);

        boolean isSorted = false;
        double buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] > nums [i+1]){
                    isSorted = false;
                    buf = nums [i];
                    nums[i] = nums [i+1];
                    nums[i+1]=buf;
                }

            }
        }
        System.out.println(Arrays.toString(nums));
    }


}
