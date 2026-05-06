class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int currMax = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]==1){
                currMax++;
                maxOne = Math.max(maxOne,currMax);
            }else{
                currMax = 0;
            }
        }
        return maxOne;
    }
}
