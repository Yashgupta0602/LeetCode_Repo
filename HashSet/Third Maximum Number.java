class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num :nums){
            set.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for(int num : set){
            list.add(num);
        }
        Collections.sort(list,Collections.reverseOrder());
        if(list.size()>=3){
            return list.get(2);
        }else{
            return list.get(0);
        }
    }
}
