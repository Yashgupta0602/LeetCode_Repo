class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num :nums1){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int k : nums2){
            if(map.containsKey(k) && map.get(k)>0){
                list.add(k);
                map.put(k,map.get(k)-1);
            }
        }
        int [] arr = new int[list.size()];
        int i = 0;
        for(int p : list){
            arr[i] = p;
            i++;
        }
        return arr;
    }
}
