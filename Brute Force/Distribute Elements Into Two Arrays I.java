class Solution {
    public int[] resultArray(int[] nums) {
        int [] arr1 = new int[nums.length];
        int [] arr2 = new int[nums.length];
        int [] result = new int[nums.length];
        int a = 0;
        int b =0;
        for(int i =0; i<nums.length; i++){
            
            if(arr1[0]==0){
                arr1[0] = nums[0];
                continue;
            }
            if(arr2[0]==0){
                arr2[0] = nums[1];
                continue;
            }
            if(arr1[a]>arr2[b]){
                arr1[a+1] = nums[i];
                a++;
            }else{
                arr2[b+1] = nums[i];
                b++;
            }
        }
        int k =0;
        while(arr1[k]!=0){
            result[k] = arr1[k];
            k++;
        }
        int l = 0;
        while(arr2[l]!=0){
            result[k] = arr2[l];
            l++;
            k++;
        }
        return result;
    }
}
