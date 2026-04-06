class Solution {
    public String makeGood(String s) {
     if(s.length()==0){
        return s;
     }   
     Stack<Character> stack = new Stack<>();
     for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(stack.isEmpty()){
            stack.push(ch);
            continue;
        }
        if(!stack.isEmpty() && Math.abs(stack.peek()-ch)==32){
            stack.pop();
        }else{
            stack.push(ch);
        }
     }
     StringBuilder sb = new StringBuilder();
     for(char st:stack){
        sb.append(st);
     }
     return String.valueOf(sb);
    }
}
