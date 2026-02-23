class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right =height.length-1;
        int maxAreaa = 0;
        int heightt = 0;
        while(left<right){
            heightt = Math.min(height[left],height[right]) * (right - left);
            maxAreaa = Math.max(maxAreaa, heightt);
            if(height[left]<height[right] ){
                left++;
            }else{
                right--;
            } 
        }
    return maxAreaa;
    }
}
