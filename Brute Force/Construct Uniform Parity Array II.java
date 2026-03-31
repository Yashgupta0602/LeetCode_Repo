class Solution {
    public boolean uniformArray(int[] nums1) {
        
        int min = Integer.MAX_VALUE;
        int minOdd = Integer.MAX_VALUE;

        for (int x : nums1) {
            min = Math.min(min, x);
            if (x % 2 == 1) {
                minOdd = Math.min(minOdd, x);
            }
        }

        
        if (min % 2 == 1) return true;

        
        if (minOdd == Integer.MAX_VALUE) return true;

        
        for (int x : nums1) {
            if (x % 2 == 1) {
                
                if (minOdd >= x) return false;
            }
        }

        return true;
    }
}
