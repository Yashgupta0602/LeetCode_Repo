class Solution {
    public String capitalizeTitle(String title) {
        String [] arr= title.split(" ");
        for(int i =0;i<arr.length;i++){
            int length = arr[i].length();
            if(length <= 2){
                arr[i] = arr[i].toLowerCase();
            }else{
                String t = arr[i].toLowerCase();
                t = Character.toUpperCase(t.charAt(0)) + t.substring(1);
                arr[i]= t;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String letter : arr){
            sb.append(letter).append(" ");
        }

        return sb.toString().trim();
    }
}
