class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int [] answer = new int[prices.length];
        int k =0;
        for(int num :prices){
            answer[k++] = num;
        }
        for(int i=0;i<prices.length;i++){
            if(stack.isEmpty()){
                stack.push(i);
                continue;
            }
            while(!stack.isEmpty() && prices[i] <= prices[stack.peek()] ){
                int temp = prices[stack.peek()] - prices[i];
                answer[stack.peek()] = temp;
                stack.pop();
            }
            stack.push(i);
        }
        return answer;
    }
} 
