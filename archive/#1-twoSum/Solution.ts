//
// Created by Penguin Zhang on 2021/3/7.
//
// MEMORY 39.3 MB/99.76%
// TIME 76 ms/97.65%

function twoSum(nums: number[], target: number): number[] {
    let n: number = nums.length;
    for(let i: number = 0; i < n; ++i)
        for(let j: number = i + 1; j < n; ++j)
            if(nums[i] + nums[j] == target)
                return [i, j];
    return [];
};