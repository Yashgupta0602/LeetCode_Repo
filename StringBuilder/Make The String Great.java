class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
                continue;
            }
            if(Math.abs(stack.peek() - ch) == 32){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: stack){
            sb.append(ch);
        }
        String ss = String.valueOf(sb);
        return ss;
    }
}
