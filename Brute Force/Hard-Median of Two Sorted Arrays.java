class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int [] arr = new int[n+m];
        for(int i =0; i<n; i++){
            arr[i] = nums1[i];
        }
        int k = n;
        for(int i =0; i<m; i++){
            arr[k] = nums2[i];
            k++;
        }
        Arrays.sort(arr);
        double median  =0;
        if(arr.length % 2 !=0){
            median = arr[arr.length/2];
        }else{
        median = (double)(arr[arr.length/2] + (double)arr[(arr.length/2)-1] ) /2;
        }
        return median;
    }
}
