class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int x = n;
        int digit = 0;
    while(x != 0){
        digit = x % 10;
        sum = sum + digit;
        product = product * digit;
        x = x / 10;
    }
    int all = sum + product;
    if(n % all == 0){
        return true;
    }
    return false;
    }
}
