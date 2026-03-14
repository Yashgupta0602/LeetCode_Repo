class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max =-1;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==map.get(arr[i])){
                max  = Math.max(max,arr[i]);
            }
        }
        return max;
    }
}
