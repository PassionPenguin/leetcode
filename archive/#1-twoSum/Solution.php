<?php

//
// Created by Penguin Zhang on 2021/3/7.
//
// MEMORY 15.4 MB/31.77%
// TIME 8 ms/99.31%

class Solution {
    function twoSum($nums, $target) {
        $count = count($nums);
        for ($i = 0;$i < $count;$i++) {
            for ($j = $i + 1;$j < $count;$j++) {
                if ($nums[$i] + $nums[$j] == $target) {
                    break 2;
                }
            }
        }
        return [$i, $j];
    }
}
