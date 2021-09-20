package com.smoothstack.dayfive.weekone;

public class AssignmentFiveRecursion {
    public static boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        int i = start + 1;
        while (i < nums.length && nums[start] == nums[i]) i++;
        if (groupSumClump(i, nums, target - ((i - start) * nums[start]))) return true;
        return groupSumClump(i, nums, target);
    }

//    public static void main(String[] args) {
    //        if (groupSumClump(0, new int[]{3, 43, 1, 1}, 46)) System.out.println("Can group sum clump.");
    //        else System.out.println("Can't group sum clump.");
    //    }
}
