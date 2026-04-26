class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        int n = str.length()-1;
        String middle  = str.substring(1,n);
        return middle.contains(s);
    }
}
