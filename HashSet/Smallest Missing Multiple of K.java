class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int m = k;
        int mul = 1;
        for(int i =1;i<10000000;i++){
            mul = m * i;
            if(!set.contains(mul)){
                return mul;
            }
        }
        return 0;
    }
}
