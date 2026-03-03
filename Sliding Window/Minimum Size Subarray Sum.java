class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int high = 0; high < nums.length; high++) {

       
            windowSum += nums[high];

            
            while (windowSum >= target) {
                int currentLength = high - low + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                }

                windowSum -= nums[low];
                low++;
            }
        }

        
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minLength;
        }
    }
}
