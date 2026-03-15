class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums1.length;i++){
            int right = 0;
            while(right<nums2.length){
                if(nums1[i]==nums2[right]){
                    set.add(nums1[i]);
                }
                right++;
            }
        }
        int [] arr = new int [set.size()];
        int i = 0;
        for(int key: set){
            arr[i] = key;
            i++;
        }
        return arr;
    }
}
