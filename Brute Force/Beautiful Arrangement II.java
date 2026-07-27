class Solution {
    public int[] constructArray(int n, int k) {
        int[] result = new int[n];
        
        int left = 1;
        int right = k + 1;
        int index = 0;
        
        int originalK = k; // ✅ store original
        
        // Step 1: Create k distinct differences
        while (left <= right) {
            if (k % 2 == 1) {
                result[index++] = left++;
            } else {
                result[index++] = right--;
            }
            k--;
        }
        
        // Step 2: Fill remaining elements
        for (int i = originalK + 2; i <= n; i++) {
            result[index++] = i;
        }
        
        return result;
    }
}
