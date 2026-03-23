class Solution {
    public int largestAltitude(int[] gain) {
        int highest  = Integer.MIN_VALUE;
        int [] arr =new int [gain.length+1];
        for(int i = 1;i<gain.length;i++){
            gain[i] = gain[i] +gain[i-1];
        }
        for(int i = 0;i<arr.length-1;i++){
            arr[i+1] = gain[i];
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>highest){
                highest = arr[i];
            }
        }
        return highest;
    }
}
