class Solution {
    public int countCommas(int n) {
        int commass = 0;
        for(int i=1;i<=n;i++){
            if(i>999){
                commass += 1;
            }
            if(i>999999){
                commass = commass +2;
            }
        }
        return commass;
    }
}
