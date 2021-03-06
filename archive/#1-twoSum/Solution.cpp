//
// Created by Penguin Zhang on 2021/3/7.
//
// MEMORY 8.4 MB/99.98%
// TIME 4 ms/95.38%

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int total = nums.size();
        for(int i = 0;i < total;i++) {
            for(int j = 0;j < total;j++) {
                if(i != j && nums[i] + nums[j] == target) {
                    return {i, j};
                }
            }
        }
        return {};
    }
};
