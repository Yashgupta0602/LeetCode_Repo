class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for(String s : word1){
            sb.append(s);
        }
        StringBuilder sb2 = new StringBuilder();
        for(String ss : word2){
            sb2.append(ss);
        }
        if(String.valueOf(sb).equals(String.valueOf(sb2))){
            return true;
        }
        return false;
    }
}
