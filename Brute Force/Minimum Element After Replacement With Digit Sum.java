class Solution {
    public int minElement(int[] nums) {
        int sum = 0;
        for(int i =0; i< nums.length; i++){
            sum = 0;
            while(nums[i] !=0){
                sum =  sum + nums[i] % 10;
                nums[i] = nums[i] / 10;
            }
            nums[i] = sum;
        }
        int min = nums[0];
        for(int num : nums){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}
