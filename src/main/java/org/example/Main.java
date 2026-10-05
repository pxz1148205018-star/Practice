package org.example;

class Solution {
    public static void moveZeroes(int[] nums){
        int j = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        for(int i = j;i < nums.length;i++){
            nums[i] = 0;
        }
    }
    static void main() {
        int nums[] = {1, 1, 0, 0, 2, 2, 0};
        moveZeroes(nums);

    }
}









