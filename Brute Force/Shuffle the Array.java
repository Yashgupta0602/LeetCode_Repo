class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr = new int[2*n];
        int i =0;
        int k = 0;
        while(i < n){
            int j = i + n;
            arr[k] = nums[i];
            k++;
            arr[k] = nums[j];
            k++;
            i++;
        }
        return arr;
    }
}
