class Solution {
    public void duplicateZeros(int[] arr) {
        int [] nums = new int[arr.length];
        int i = 0;
        int k = 0;
        while(k < nums.length){
            if(arr[i]!=0){
                nums[k] = arr[i];
                i++;
                k++;
                continue;
            }else{
                nums[k] = 0;
                k++;
                if(k < nums.length){
                    nums[k] = 0;
                    k++;
                }
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            arr[j] = nums[j];
        }
        return;
    }
}
