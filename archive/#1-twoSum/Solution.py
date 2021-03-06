#
# Created by Penguin Zhang on 2021/3/7.
#
# MEMORY 38 MB/82.57%
# TIME 0 ms/84.73%

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        for i in range(n):
            for j in range(i + 1, n):
                if nums[i] + nums[j] == target:
                    return [i, j]

        return []