class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
                continue;
            }
            if(stack.peek()==ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        return String.valueOf(sb);
    }
}
