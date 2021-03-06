//
// Created by Penguin Zhang on 2021/3/7.
//
// MEMORY 38 MB/99.97%
// TIME 0 ms/100%

class Solution {
    public int[] twoSum(int[] nums, int target) {
        final int n = nums.length;
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                if(nums[i] + nums[j] == target)
                    return new int[]{i, j};
        return new int[]{0};
    }
}