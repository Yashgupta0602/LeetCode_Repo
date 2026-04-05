class Solution {
    class Pair{
    char ch;
    int count;

    Pair(char ch,int count){
        this.ch = ch;
        this.count = count;
    }
}
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
             char st = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(new Pair(st,1));
                continue;
            }
            if(!stack.isEmpty() && stack.peek().ch==st){
                if(stack.peek().count==k-1){
                    stack.pop();
                }else{
                    stack.peek().count++;
                }

            }else{
                stack.push(new Pair(st,1));
            }
        }
        StringBuilder sb = new StringBuilder();

        for (Pair p : stack) {
            for (int i = 0; i < p.count; i++) {
                sb.append(p.ch);
            }
        }
        return String.valueOf(sb);
    }
}
