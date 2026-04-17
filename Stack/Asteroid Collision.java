class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            int curr = asteroids[i];

            if (stack.isEmpty() || curr > 0) {
                stack.push(curr);
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > 0) {

                if (Math.abs(curr) > stack.peek()) {
                    stack.pop(); 
                    continue;
                } 
                else if (Math.abs(curr) == stack.peek()) {
                    stack.pop(); 
                }

                curr = 0; 
                break;
            }

            if (curr != 0) {
                stack.push(curr);
            }
        }

        int[] arr = new int[stack.size()];
        int k = 0;
        for (int num : stack) {
            arr[k++] = num;
        }

        return arr;
    }
}
