class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char charac : s.toCharArray()){
            if(set.contains(charac)){
                return charac;
            }else{
                set.add(charac);
            }
        }
        return ' ';
    }
}
