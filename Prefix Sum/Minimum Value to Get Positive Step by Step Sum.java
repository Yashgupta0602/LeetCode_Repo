class Solution {
    public int minStartValue(int[] nums) {
        int prefixSum = 0;
        int minimum = 0;
        for(int i = 0; i< nums.length; i++){
            nums[i] = nums[i] + prefixSum;
            prefixSum = nums[i];
            minimum = Math.min(minimum,nums[i]);
        }
        int startValue = 1 - (minimum);
        return startValue;
    }
}
