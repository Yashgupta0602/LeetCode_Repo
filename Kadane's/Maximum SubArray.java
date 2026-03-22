class Solution {
    public int maxSubArray(int[] nums) {
        int runningSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            runningSum = Math.max(nums[i],runningSum+nums[i]);
            maxSum = Math.max(maxSum,runningSum);
        }
        return maxSum;
    }
}
