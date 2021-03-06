//
// Created by Penguin Zhang on 2021/3/7.
//
// MEMORY 38 MB/52.36%
// TIME 68 ms/99.07%

var twoSum = function(nums, target) {
    let n = nums.length;
    for(let i = 0; i < n; ++i)
        for(let j = i + 1; j < n; ++j)
            if(nums[i] + nums[j] === target)
                return [i, j];
    return [];
};