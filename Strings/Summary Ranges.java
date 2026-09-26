class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length==0){
            return list;
        }
        int a = 0;
        boolean unique = true;
        for(int i =0; i< nums.length-1; i++){
            if(nums[i+1]!=nums[i]+1 && unique==true){
                list.add(String.valueOf(nums[i]));
                continue;
            }
            if(nums[i+1]==nums[i]+1 && unique==true){
                unique = false;
                a = nums[i];
                continue;
            }
            if(nums[i+1]==nums[i]+1 && unique==false){
                continue;
            }
            if(nums[i]!=nums[i]+1 && unique==false){
                list.add(a+"->"+nums[i]);
                unique = true;
            } 
        }
        if(unique==true){
            list.add(String.valueOf(nums[nums.length-1]));
        }
        if(unique==false){
            list.add(a+"->"+nums[nums.length-1]);
        }
        return list;
    }
}
