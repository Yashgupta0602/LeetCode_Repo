class Solution {
    public int[] replaceElements(int[] arr) {
        int maximum = -1;
        for(int i = arr.length-1; i >=0; i--){
            int x = maximum;
            maximum = Math.max(arr[i],maximum);
            arr[i] = x;
        }
        return arr;
    }
}
