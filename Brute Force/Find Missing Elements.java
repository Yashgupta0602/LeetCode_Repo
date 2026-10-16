class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int k = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=k){
                for(int j=nums[i-1]+1; j<nums[i]; j++){
                    list.add(j);
                }
                k = nums[i]+1;
            }else{
                k++;
            }
        }
        return list;
    }
}
