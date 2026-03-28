// stack


class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack  =new Stack<>();
        int n = nums.length;
        int [] arr = new int [n];
        Arrays.fill(arr,-1);
        for(int i = 0;i<2*n;i++){
            int index = i % n;
            while(!stack.isEmpty() && nums[index] > nums[stack.peek()]){
                int prev = stack.pop();
                arr[prev] = nums[index];
            }
            if(i<n){
                stack.push(index);
            }
            
        }
        return arr;
    }
}
