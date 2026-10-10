class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a, b = 0;
        int result = 0;
        for(String s : tokens){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*")&& !s.equals("/")){
                int x = Integer.valueOf(s);
                stack.push(x);
                continue;
            }
            if(s.equals("+")){
                a = stack.pop();
                b = stack.pop();
                result = a+b;
                stack.push(result);
            }
            if(s.equals("-")){
                a = stack.pop();
                b = stack.pop();
                result = b-a;
                stack.push(result);
            }
            if(s.equals("*")){
                a = stack.pop();
                b = stack.pop();
                result = b*a;
                stack.push(result);
            }
            if(s.equals("/")){
                a = stack.pop();
                b = stack.pop();
                result = b/a;
                stack.push(result);
            }
        }
        return stack.pop();
    }
}
