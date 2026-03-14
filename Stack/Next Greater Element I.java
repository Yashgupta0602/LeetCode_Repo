class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int [] arr = new int [nums1.length];
        for(int i =nums2.length-1;i>=0;i--){
            stack.push(nums2[i]);
        }
        for(int j =0;j<nums1.length;j++){
             int next = -1;
            while(!stack.isEmpty()){
            if(nums1[j]==stack.peek()){
                stack.pop();
                while(!stack.isEmpty()){
                if(stack.peek()>nums1[j]){
                    next = stack.peek();
                    break;
                }else{
                    stack.pop();
                    }
                }
            }else{
                stack.pop();
            }
        }
        arr[j] = next;
        stack.clear();
        for(int i =nums2.length-1;i>=0;i--){
            stack.push(nums2[i]);
        }
        }
        return arr;
    }
}
