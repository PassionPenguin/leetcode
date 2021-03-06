//
// Created by Penguin Zhang on 2021/3/7.
//
// MEMORY 35.3 MB/92.03%
// TIME 192 ms/99.71%

internal class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val n = nums.size
        for (i in 0 until n)
            for (j in i + 1 until n)
                if (nums[i] + nums[j] == target)
                    return intArrayOf(i, j)
        return intArrayOf(0)
    }
}