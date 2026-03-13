class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;
        for(char ch :stones.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(char st: jewels.toCharArray()){
            if(map.containsKey(st)){
                count += map.get(st) ;
            }
        }
        return count;
    }
}
