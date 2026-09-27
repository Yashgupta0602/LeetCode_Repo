class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = score.clone();
        Arrays.sort(arr);
        int k= 1;
        for(int i =arr.length-1; i>=0;i--){
            map.put(arr[i],k);
            k++;
        }
        String [] arr1 = new String[score.length];
        for(int i = 0; i< arr1.length; i++){
            int rank = map.get(score[i]);
            if(rank==1){
                arr1[i] = "Gold Medal";
            }else if(rank ==2){
                arr1[i] = "Silver Medal";
            }else if(rank==3){
                arr1[i]= "Bronze Medal";
            }else{
                arr1[i] = String.valueOf(rank);
            }
        }
        return arr1;
    }
}
