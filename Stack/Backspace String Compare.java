class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch!='#'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    continue;
                }else{
                stack.pop();
                }
            }
        }
        s = "";
        while(!stack.isEmpty()){
            s = s+ stack.pop();
        }
         for(char ch : t.toCharArray()){
            if(ch!='#'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    continue;
                }else{
                stack.pop();
                }
            }
        }
        t = "";
        while(!stack.isEmpty()){
            t = t+ stack.pop();
        }
        if(s.equals(t)){
            return true;
        }
        return false;
    }
}
