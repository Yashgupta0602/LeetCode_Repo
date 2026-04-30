class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(countA > 1 || countL > 2){
                return false;
            }
            if(ch=='A'){
                countA++;
                countL = 0;
            }
            if(ch=='P'){
                countL = 0;
            }
            if(ch=='L'){
                countL++;
            }
        }
        if(countA < 2 && countL < 3){
            return true;
        }
        return false;
    }
}
