class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(char st : t.toCharArray()){
            if(map.containsKey(st) && map.get(st) >0){
                map.put(st,map.get(st)-1);
            }else if(map.containsKey(st) && map.get(st) ==0){
                return st;
            }else{
                return st;
            }
        }
        return ' ';
    }
}
