class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: magazine.toCharArray()){
            if(map.containsKey(ch)){   
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
        }
        }
        for(char st :ransomNote.toCharArray()){
            if(map.containsKey(st) && map.get(st)>0){
                map.put(st,map.get(st)-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
