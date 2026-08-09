class Solution {
    public int alternateDigitSum(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        String str = String.valueOf(sb);
        n = Integer.parseInt(str);
        int k = 0;
        int sum = 0;
        while(n != 0){
            if(k % 2 == 0){
                sum = sum + n % 10;
            }else{
                sum = sum - n %10;
            }
            n = n /10;
            k++;
        }
        return sum;
    }
}
