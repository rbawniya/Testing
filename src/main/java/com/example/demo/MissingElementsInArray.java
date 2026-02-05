package com.example.demo;

import java.util.Arrays;

public class MissingElementsInArray {
    public static void main(String[] args) {
        int[] nums = {1,3,6,8,10};
        int n = nums.length+1;
        int actualSum = n*(n+1)/2;

        int total = Arrays.stream(nums).sum();

        System.out.println(actualSum - total);


        Arrays.sort(nums);

        for(int i = nums[0]; i <= nums[nums.length -1] ; i++) {
            boolean flag = false;
            for(int num : nums) {
                if(i == num) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.println("missing number is = "+i);
        }
    }
}
