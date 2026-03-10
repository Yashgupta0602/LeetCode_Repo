class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String s :operations){
            if(!s.equals("+") && !s.equals("C") && !s.equals("D")){
                int num = Integer.parseInt(s);
                stack.push(num);
                continue;
            }
            if(stack.size()>1 && s.equals("+")){
                int x = stack.pop();
                int y = stack.pop();
                int z =x+y;
                stack.push(y);
                stack.push(x);
                stack.push(z);
                continue;
            }
            if(!stack.isEmpty() && s.equals("D")){
                int a = stack.peek();
                a = a*2;
                stack.push(a);
                continue;
            }
            if(!stack.isEmpty() && s.equals("C")){
                stack.pop();
                continue;
            }
            }
            int sum = 0;
            if(stack.isEmpty()){
            return sum;
            }else{
            for(int x: stack){
                 sum = sum + x;
            }
            }
            return sum;
        }
    }
