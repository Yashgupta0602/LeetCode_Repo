class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> list = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                list.add(Integer.parseInt(String.valueOf(ch)));
            }
        }
        int [] arr = new int [list.size()];
        int i = 0;
        for(int n : list){
            arr[i] = n;
            i++;
        }
        Arrays.sort(arr);
        if(arr.length > 1){
            return arr[arr.length-2];
        }
        return -1;
    }
}
