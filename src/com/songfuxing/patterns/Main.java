package com.songfuxing.patterns;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] result = twoSum(nums, 5);
        if (result != null) {
            System.out.println(result[0]);
            System.out.println(result[1]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        if (len < 2) {
            return null;
        }
        for (int i = 0; i < len - 1; i ++) {
            for (int j = i + 1; j < len; j ++) {
                if (nums[i] + nums[j] == target) {
                    int[] result = {i,j};
                    return result;
                }
            }
        }
        return null;
    }
}
