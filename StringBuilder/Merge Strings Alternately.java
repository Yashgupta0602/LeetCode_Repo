class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int minLen = Math.min(word1.length(),word2.length());
        int x = 0;
        for(int i =0;i < minLen;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            x = i;
        }
        String str = sb.toString();
        if(word1.length() > minLen){
            str = str + word1.substring(x+1);
        }else{
            str = str + word2.substring(x+1);
        }
        return str;
    }
}
