//
// Created by Penguin Zhang on 2021/3/7.
//
// MEMORY 30.9 MB/70.14%
// TIME 272 ms/100%

public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int n = nums.Length;
        for(int i = 0; i < n; ++i)
            for(int j = i + 1; j < n; ++j)
                if(nums[i] + nums[j] == target)
                    return new int[]{i, j};
        return new int[]{};
    }
}