class Solution {
    public int waysToSplitArray(int[] nums) {
        long total = 0;
        for(int num : nums){
            total += num;
        }
        long right = total;
        long left = 0;
        long count = 0;
        for(int i =0; i< nums.length-1; i++){
            right = right - nums[i];
            left = left + nums[i];
            if(left >= right){
                count++;
            }
        }
        return (int)count;
    }
}
