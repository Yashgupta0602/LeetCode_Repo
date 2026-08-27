class Solution {
    public int minimumChairs(String s) {
        int chairs = 0;
        int maxChairs = 0;
        for(int i =0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'E'){
                chairs++;
                maxChairs = Math.max(chairs,maxChairs);

            }else{
                chairs--;
            }
        }
        return maxChairs;
    }
}
