// StringBuilder----->


class Solution {
    public int minimizedStringLength(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            boolean found = false;
            for(int j=0;j<sb.length();j++){
                if(sb.charAt(j)==ch){
                    found = true;
                }
            }
            
        if(found ==false){
            sb.append(ch);
        }
        }
        return sb.length();
    }
}
