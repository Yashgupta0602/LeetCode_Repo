class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        int majority = -1;
        for(int num: map.keySet()){
            if(map.get(num) > Math.floor(n/2)){
                majority = num;
                break;
            }
        }
        return majority;
    }
}
