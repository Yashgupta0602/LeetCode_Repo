class MinStack {
    Stack <Integer> stack = new Stack<>();
    Stack< Integer> minStack = new Stack<>();

    public MinStack() {
       
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek() ){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        int top1 = stack.peek();
        return top1;
    }
    
    public int getMin() {
        int top2 = minStack.peek();
        return top2;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
