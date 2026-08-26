class Solution {
    public int maxPower(String s) {
        int count= 1;
        int maxLen =1;
        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(i > 0 && ch == s.charAt(i-1)){
                count++;
                maxLen = Math.max(maxLen,count);
            }else{
                count = 1;
            }
        }
        return maxLen;
    }
}
