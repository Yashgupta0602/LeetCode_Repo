class Solution {
    public int maxProduct(int n) {
        int a  = 0;
        int b = 0;
        int digit = 0;
        while(n!=0){
            digit = n % 10;
            n = n /10;
            if(a<digit){
                b = a;
                a = digit;
            }else if(a >= digit && b < digit){
                b = digit;
            }
        }
        return a*b;
    }
}
