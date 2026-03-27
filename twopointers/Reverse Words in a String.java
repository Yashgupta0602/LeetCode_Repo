class Solution {
    public String reverseWords(String s) {
        
        String [] arr  =s.split("\\s+");
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            String temp  =arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String t = "";
        for(int i = 0;i<arr.length;i++){
            t = t+arr[i] +" ";
        }
        t = t.trim();
        return t;
    }
}
