package com.abhijeet;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println("Answer: " + binarySearch(nums, target));
    }

    private static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            int middle = start + ((end - start) / 2);

            if (nums[middle] == target)
                return middle;
            else if (target > nums[middle]) {
                start = middle + 1;
            } else if (target < nums[middle]) {
                end = middle - 1;
            }
        }

        return -1;
    }
}
