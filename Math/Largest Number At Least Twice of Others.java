class Solution {
    public int dominantIndex(int[] nums) {
        int largest = 0;
        for(int i =0; i< nums.length; i++){
            if(nums[i] > nums[largest]){
                largest = i;
            }
        }
        int k = 0;
        while (k < nums.length){
            if(k == largest){
                k++;
            }else{
                if(nums[largest] >= 2 * nums[k]){
                    k++;
                }else{
                    return -1;
                }
            }
        }
        return largest;
    }
}
