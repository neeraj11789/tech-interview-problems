package leetcode;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int res = sum;
        for(int i=1; i<nums.length; i++){
            sum = sum + nums[i];
            sum = Math.max(sum, nums[i]);
            if(sum > res)
                res = sum;
        }
        return res;
    }
}
