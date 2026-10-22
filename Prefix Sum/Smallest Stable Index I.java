class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length==1){
            if(nums[0]-nums[0] <= k){
                return 0;
            }
        }
        int min [] = new int[nums.length];
        int m = nums[nums.length-1];
        for(int i =nums.length-1; i>=0; i--){
            if(nums[i]<m){
                m = nums[i];
                min[i] = m;
            }else{
                min[i] = m;
            }
        }
        int max = nums[0];
        for(int i =0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
            if((max - min[i])<= k){
                return i;
            }
        }
        return -1;
    }
}
