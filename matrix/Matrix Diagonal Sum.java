class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i =0; i< mat.length;i++){
            for(int j=0; j<mat[i].length; j++){
                if(i==j){
                    sum = sum + mat[i][j];
                }
                if(i+j==n-1){
                    sum += mat[i][j];
                }
            }
        }
        int k = n /2;
        if(mat.length % 2 != 0){
            sum = sum - mat[k][k];
        }
        return sum;
    }
}
