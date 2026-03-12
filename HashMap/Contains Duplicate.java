class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            int i=0;
            if(map.containsKey(num)){
                return true;
            }else{
                map.put(num,i);
                i++;
            }
        }
        return false;
    }
}
