class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int k : nums1){
            list.add(k);
        }
        List<Integer> result = new ArrayList<>();
        for(int num : nums2){
            if(list.contains(num)){
                result.add(num);
                list.remove(Integer.valueOf(num));
            }
        }
        int [] arr = new int[result.size()];
        int i = 0;
        for(int p : result){
            arr[i] = p;
            i++;
        }
        return arr;
    }
}
