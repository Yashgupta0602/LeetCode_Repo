class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for(int i = 0; i<accounts.length; i++){
            int currSum = 0;
            for(int j = 0; j<accounts[i].length; j++){
                currSum += accounts[i][j];

            }
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}
