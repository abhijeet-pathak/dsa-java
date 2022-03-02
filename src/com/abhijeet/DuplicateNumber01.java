package com.abhijeet;

public class DuplicateNumber01 {
    public static void main(String[] args) {
//        int[] nums = {-87,-417,468,-209,817,370,-289,-953,927,-54,-272,-655,252,-760,12,-879,-553,574,-411,-735,513};
//        int[] nums = {1,2,3,4};
//        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        int[] nums = {170,-368,148,672,397,-629,-788,192,170,309,-615,-237};

        System.out.println(approach2(nums));
    }

    private static boolean approach2(int[] nums) {
        int[] nums2 = new int[nums.length];

        int nums_added = -1;

        for (int i=0; i<nums.length; i++) {
            if (nums_added == -1) {
                nums2[i] = nums[i];
                nums_added++;
            }
            else {
                for (int j=0; j<=nums_added; j++) {
                    if (nums2[j] == nums[i])
                        return true;
                }

                if (nums[i] > nums2[nums_added]) {
                    nums2[++nums_added] = nums[i];
                } else {
                    int insertAt = -1;

                    if (nums[i] < nums2[0])
                        insertAt = 0;
                    else {

                        for (int l = 0; l <nums_added; l++) {
                            if (nums[i] > nums2[l] && nums[i]<nums2[l+1]) {
                                insertAt = l+1;
                                break;
                            }
                        }
                    }

                    if (insertAt > -1) {
                        for (int k = nums_added; k >= insertAt; k--) {
                            nums2[k + 1] = nums2[k];
                        }

                        nums2[insertAt] = nums[i];
                        nums_added++;
                    }

                }


            }

        }

        return false;
    }
}
