class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        for(int num : nums){
            totalSum = totalSum + num;
        }
        int rightSum = totalSum;
        int leftSum = 0;
        for(int i =0; i< nums.length; i++){
            rightSum  = rightSum - nums[i];
            leftSum = totalSum - rightSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}
