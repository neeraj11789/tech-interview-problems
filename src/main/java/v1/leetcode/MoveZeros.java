package v1.leetcode;

class MoveZeros {
    public void moveZeroes(int[] nums) {
        int leftShift = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)
                leftShift++;
            else{
                nums[i-leftShift] = nums[i];
            }
        }
        // fill in last elements with 0
        for(int i = 0; i<leftShift; i++){
            nums[nums.length-1 - i] = 0;
        }
    }
}