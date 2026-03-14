class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] nums = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++){
            int n = nums1[i];
            int next  =-1;
            for(int j=0;j<nums2.length;j++){
               if(nums2[j]==n){
                for(int k = j+1;k<nums2.length;k++){
                    if(nums2[k]>n){
                        next = nums2[k];
                        break;
                    }
                }
                break;
               }
            }
            nums[i] = next;
        }
        return nums;
    }
}
