class Solution {
    public long sumAndMultiply(int n) {
    String s = Integer.toString(n);
    StringBuilder sb = new StringBuilder();
    for(char ch : s.toCharArray()){
        if(ch!='0'){
            sb.append(ch);
        }
    }
    if(sb.isEmpty()){
        return 0;
    }
    int num = Integer.parseInt(sb.toString());
    int x = num;
    int sum = 0;
    while(x!=0){
        sum = sum + x % 10;
        x = x / 10;
    }
    return (long) num*sum;
    }
}
